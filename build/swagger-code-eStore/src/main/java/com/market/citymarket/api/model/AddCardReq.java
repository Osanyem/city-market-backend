package com.market.citymarket.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request object for new card registration.
 */

@Schema(name = "AddCardReq", description = "Request object for new card registration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AddCardReq extends RepresentationModel<AddCardReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("cardNumber")
  private String cardNumber;

  @JsonProperty("expires")
  private String expires;

  @JsonProperty("ccv")
  private String ccv;

  @JsonProperty("userId")
  private Object userId;

  public AddCardReq cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Card Number
   * @return cardNumber
  */
  
  @Schema(name = "cardNumber", description = "Card Number", required = false)
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public AddCardReq expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Expiration date
   * @return expires
  */
  
  @Schema(name = "expires", description = "Expiration date", required = false)
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public AddCardReq ccv(String ccv) {
    this.ccv = ccv;
    return this;
  }

  /**
   * CCV code
   * @return ccv
  */
  
  @Schema(name = "ccv", description = "CCV code", required = false)
  public String getCcv() {
    return ccv;
  }

  public void setCcv(String ccv) {
    this.ccv = ccv;
  }

  public AddCardReq userId(Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", required = false)
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCardReq addCardReq = (AddCardReq) o;
    return Objects.equals(this.cardNumber, addCardReq.cardNumber) &&
        Objects.equals(this.expires, addCardReq.expires) &&
        Objects.equals(this.ccv, addCardReq.ccv) &&
        Objects.equals(this.userId, addCardReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCardReq {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    ccv: ").append(toIndentedString(ccv)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

