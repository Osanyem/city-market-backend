package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.AddressEntity;
import com.market.citymarket.api.entity.CardEntity;
import com.market.citymarket.api.entity.UserEntity;
import java.util.Optional;


public interface UserService {
  void deleteCustomerById(String id);
  Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
  Iterable<UserEntity> getAllCustomers();
  Optional<CardEntity> getCardByCustomerId(String id);
  Optional<UserEntity> getCustomerById(String id);
}
