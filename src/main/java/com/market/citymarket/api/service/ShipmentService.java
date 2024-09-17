package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.ShipmentEntity;
import jakarta.validation.constraints.Min;


public interface ShipmentService {
  Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
