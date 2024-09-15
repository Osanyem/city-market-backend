package com.market.citymarket.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AddAddressReqAllOf
 */

@JsonTypeName("AddAddressReq_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AddAddressReqAllOf extends RepresentationModel<AddAddressReqAllOf>  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private String userId;

  public AddAddressReqAllOf userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", required = false)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
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
    AddAddressReqAllOf addAddressReqAllOf = (AddAddressReqAllOf) o;
    return Objects.equals(this.userId, addAddressReqAllOf.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAddressReqAllOf {\n");
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

