package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.AddressEntity;
import com.market.citymarket.api.model.AddAddressReq;

import java.util.Optional;


public interface AddressService {
  Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

  void deleteAddressesById(String id);

  Optional<AddressEntity> getAddressesById(String id);

  Iterable<AddressEntity> getAllAddresses();
}
