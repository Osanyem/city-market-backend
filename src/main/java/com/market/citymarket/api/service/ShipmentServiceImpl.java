package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.ShipmentEntity;
import com.market.citymarket.api.repository.ShipmentRepository;
import jakarta.validation.constraints.Min;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;


@Service
public class ShipmentServiceImpl implements ShipmentService {

  private final ShipmentRepository repository;

  public ShipmentServiceImpl(ShipmentRepository repository) {
    this.repository = repository;
  }

  @Override
  public Iterable<ShipmentEntity> getShipmentByOrderId(
      @Min(value = 1L, message = "Invalid shipment ID.") String id) {
    return repository.findAllById(List.of(UUID.fromString(id)));
  }
}
