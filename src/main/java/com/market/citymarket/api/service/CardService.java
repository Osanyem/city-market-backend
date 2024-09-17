package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.CardEntity;
import com.market.citymarket.api.model.AddCardReq;
import jakarta.validation.Valid;
import java.util.Optional;


public interface CardService {
  void deleteCardById(String id);
  Iterable<CardEntity> getAllCards();
  Optional<CardEntity> getCardById(String id);
  Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
