package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.AuthorizationEntity;
import com.market.citymarket.api.model.PaymentReq;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Optional;


public interface PaymentService {

  Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
  Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
