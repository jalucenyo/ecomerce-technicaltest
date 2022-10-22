package com.ecomerce.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record Price(
    Long brandId,
    OffsetDateTime startDate,
    OffsetDateTime endDate,
    Long priceList,
    Long productId,
    Integer priorityId,
    BigDecimal price,
    String curr
) { }
