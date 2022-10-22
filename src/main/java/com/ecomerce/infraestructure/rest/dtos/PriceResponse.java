package com.ecomerce.infraestructure.rest.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record PriceResponse(
    Long productId,
    Long brandId,
    BigDecimal price,
    OffsetDateTime startDate,
    OffsetDateTime endDate,
    Long priceList
) { }
