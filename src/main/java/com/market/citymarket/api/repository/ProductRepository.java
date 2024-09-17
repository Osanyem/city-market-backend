package com.market.citymarket.api.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.market.citymarket.api.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}
