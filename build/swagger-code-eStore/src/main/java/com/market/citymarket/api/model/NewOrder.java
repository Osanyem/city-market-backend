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
 * Contains the new order request information
 */

@Schema(name = "NewOrder", description = "Contains the new order request information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NewOrder extends RepresentationModel<NewOrder>  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("customer")
  private Object customer;

  @JsonProperty("address")
  private Object address;

  @JsonProperty("card")
  private Object card;

  @JsonProperty("items")
  private Object items;

  public NewOrder customer(Object customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  
  @Schema(name = "customer", required = false)
  public Object getCustomer() {
    return customer;
  }

  public void setCustomer(Object customer) {
    this.customer = customer;
  }

  public NewOrder address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", required = false)
  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public NewOrder card(Object card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  
  @Schema(name = "card", required = false)
  public Object getCard() {
    return card;
  }

  public void setCard(Object card) {
    this.card = card;
  }

  public NewOrder items(Object items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  
  @Schema(name = "items", required = false)
  public Object getItems() {
    return items;
  }

  public void setItems(Object items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOrder newOrder = (NewOrder) o;
    return Objects.equals(this.customer, newOrder.customer) &&
        Objects.equals(this.address, newOrder.address) &&
        Objects.equals(this.card, newOrder.card) &&
        Objects.equals(this.items, newOrder.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, address, card, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrder {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

