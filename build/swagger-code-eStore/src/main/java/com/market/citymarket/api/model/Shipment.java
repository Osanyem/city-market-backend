package com.market.citymarket.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
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
 * Shipment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Shipment extends RepresentationModel<Shipment>  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("carrier")
  private String carrier;

  @JsonProperty("trackingNumber")
  private String trackingNumber;

  @JsonProperty("estDeliveryDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate estDeliveryDate;

  public Shipment orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identifier
   * @return orderId
  */
  
  @Schema(name = "orderId", description = "Order Identifier", required = false)
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Shipment carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Shipping Carrier
   * @return carrier
  */
  
  @Schema(name = "carrier", description = "Shipping Carrier", required = false)
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Shipment trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Shipping Tracking Number
   * @return trackingNumber
  */
  
  @Schema(name = "trackingNumber", description = "Shipping Tracking Number", required = false)
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Shipment estDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Estimated Delivery Date
   * @return estDeliveryDate
  */
  @Valid 
  @Schema(name = "estDeliveryDate", description = "Estimated Delivery Date", required = false)
  public LocalDate getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.orderId, shipment.orderId) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.estDeliveryDate, shipment.estDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber, estDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    estDeliveryDate: ").append(toIndentedString(estDeliveryDate)).append("\n");
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

