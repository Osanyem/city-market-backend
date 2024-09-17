package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.OrderEntity;
import com.market.citymarket.api.model.NewOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Optional;


public interface OrderService {

  Optional<OrderEntity> addOrder(@Valid NewOrder newOrder);
  Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId);
  Optional<OrderEntity> getByOrderId(String id);
}
