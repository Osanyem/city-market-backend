package com.market.citymarket.api.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.market.citymarket.api.entity.OrderItemEntity;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}
