package com.market.citymarket.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * Product information
 */

@Schema(name = "Product", description = "Product information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Product extends RepresentationModel<Product>  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("imageUrl")
  private String imageUrl;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("tag")
  @Valid
  private Set<String> tag = null;

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Product identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Product identifier", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Product Name
   * @return name
  */
  
  @Schema(name = "name", description = "Product Name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Prodcut's description
   * @return description
  */
  
  @Schema(name = "description", description = "Prodcut's description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Product image's URL
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", description = "Product image's URL", required = false)
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Product price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Product price
   * @return price
  */
  
  @Schema(name = "price", description = "Product price", required = false)
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Product count
   * @return count
  */
  
  @Schema(name = "count", description = "Product count", required = false)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Product tag(Set<String> tag) {
    this.tag = tag;
    return this;
  }

  public Product addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new LinkedHashSet<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * Tags associated with the product
   * @return tag
  */
  
  @Schema(name = "tag", description = "Tags associated with the product", required = false)
  public Set<String> getTag() {
    return tag;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setTag(Set<String> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.count, product.count) &&
        Objects.equals(this.tag, product.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, price, count, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

