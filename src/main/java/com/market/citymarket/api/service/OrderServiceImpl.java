package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.OrderEntity;
import com.market.citymarket.api.exception.ResourceNotFoundException;
import com.market.citymarket.api.model.NewOrder;
import com.market.citymarket.api.repository.OrderRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

  private final OrderRepository repository;
  private OrderRepository userRepo;

  public OrderServiceImpl(OrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public Optional<OrderEntity> addOrder(@Valid NewOrder newOrder) {
    if (Strings.isEmpty(newOrder.getCustomerId())) {
      throw new ResourceNotFoundException("Invalid customer id.");
    }
    if (Objects.isNull(newOrder.getAddress()) || Strings.isEmpty(newOrder.getAddress().getId())) {
      throw new ResourceNotFoundException("Invalid address id.");
    }
    if (Objects.isNull(newOrder.getCard()) || Strings.isEmpty(newOrder.getCard().getId())) {
      throw new ResourceNotFoundException("Invalid card id.");
    }
    // 1. Save Order
    return repository.insert(newOrder);
    // Ideally, here it will trigger the rest of the process
    // 2. Initiate the payment
    // 3. Once the payment is authorized, change the status to paid
    // 4. Initiate the Shipment and changed the status to Shipment Initiated or Shipped
  }

  @Override
  public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId) {
    return repository.findByCustomerId(UUID.fromString(customerId));
  }

  @Override
  public Optional<OrderEntity> getByOrderId(String id) {
    return repository.findById(UUID.fromString(id));
  }
}
