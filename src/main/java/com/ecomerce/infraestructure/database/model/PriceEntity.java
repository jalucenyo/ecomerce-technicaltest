package com.ecomerce.infraestructure.database.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Getter
@Setter
@Entity(name = "prices")
public class PriceEntity{

  @Id
  private Long priceList;
  private Long brandId;
  private OffsetDateTime startDate;
  private OffsetDateTime endDate;
  private Long productId;
  private Integer priority;
  private BigDecimal price;
  private String curr;

}
