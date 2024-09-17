package com.market.citymarket.api.repository;

import static java.util.stream.Collectors.toList;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Repository;

import com.market.citymarket.api.entity.CartEntity;
import com.market.citymarket.api.entity.ItemEntity;
import com.market.citymarket.api.entity.OrderEntity;
import com.market.citymarket.api.entity.OrderItemEntity;
import com.market.citymarket.api.model.NewOrder;
import com.market.citymarket.api.model.Order.StatusEnum;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepositoryImpl implements OrderRepositoryExt {

    @PersistenceContext
    private final EntityManager entityManager;

    private final ItemRepository itemRepo;
    private final CartRepository cartRepository;
    private final OrderItemRepository orderItemRepository;

    public OrderRepositoryImpl(
            EntityManager entityManager, ItemRepository itemRepo, CartRepository cartRepository, OrderItemRepository orderItemRepository) {
        this.entityManager = entityManager;
        this.itemRepo = itemRepo;
        this.cartRepository = cartRepository;
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public Optional<OrderEntity> insert(NewOrder newOrder) {
        // Items are already in cart and saved in db when user places the order
        // Here, you can also populate the other Order details like address, card etc.
        Iterable<ItemEntity> dbItems = itemRepo.findByCustomerId(newOrder.getCustomerId());
        List<ItemEntity> items = StreamSupport.stream(dbItems.spliterator(), false).toList();
        if (items.size() < 1) {
            throw new ResourceNotFoundException(
                    String.format("There is no item found in customer's (ID: %s) cart.", newOrder.getCustomerId()));
        }
        BigDecimal total = BigDecimal.ZERO;
        for (ItemEntity i : items) {
            total = (BigDecimal.valueOf(i.getQuantity()).multiply(i.getPrice())).add(total);
        }
        Timestamp orderDate = Timestamp.from(Instant.now());
        entityManager.createNativeQuery(
                """
                        INSERT INTO ecomm.orders (address_id, card_id, customer_id, order_date, total, status)
                         VALUES(?, ?, ?, ?, ?, ?)
                        """)
                .setParameter(1, newOrder.getAddress().getClass())
                .setParameter(2, newOrder.getCard().getClass())
                .setParameter(3, newOrder.getCustomerId())
                .setParameter(4, orderDate)
                .setParameter(5, total)
                .setParameter(6, StatusEnum.CREATED.getValue())
                .executeUpdate();
        Optional<CartEntity> oCart = cartRepository.findByCustomerId(UUID.fromString(newOrder.getCustomerId()));
        CartEntity cart = oCart.orElseThrow(
                () -> new ResourceNotFoundException(
                        String.format(
                                "Cart not found for given customer (ID: %s)", newOrder.getCustomerId())));
        itemRepo.deleteCartItemJoinById(
                cart.getItems().stream().map(ItemEntity::getId).collect(toList()), cart.getId());
        OrderEntity entity = (OrderEntity) entityManager.createNativeQuery(
                """
                        SELECT o.* FROM ecomm.orders o WHERE o.customer_id = ? AND o.order_date >= ?
                        """,
                OrderEntity.class)
                .setParameter(1, newOrder.getCustomerId())
                .setParameter(
                        2,
                        OffsetDateTime.ofInstant(orderDate.toInstant(), ZoneId.of("Z"))
                                .truncatedTo(ChronoUnit.MICROS))
                .getSingleResult();
        orderItemRepository.saveAll(
                cart.getItems().stream()
                        .map(i -> new OrderItemEntity().setOrderId(entity.getId()).setItemId(i.getId()))
                        .collect(toList()));
        return Optional.of(entity);
    }
}
