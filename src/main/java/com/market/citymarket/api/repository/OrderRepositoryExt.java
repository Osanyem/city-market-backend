package com.market.citymarket.api.repository;

import java.util.Optional;

import com.market.citymarket.api.entity.OrderEntity;
import com.market.citymarket.api.model.NewOrder;

public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}
