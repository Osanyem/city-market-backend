package com.market.citymarket.api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.market.citymarket.api.entity.CartEntity;

public interface CartRepository extends CrudRepository<CartEntity, UUID> {
    @Query("select c from CartEntity c join c.user u where u.id = :customerId")
    Optional<CartEntity> findByCustomerId(@Param("customerId") UUID customerId);
}
