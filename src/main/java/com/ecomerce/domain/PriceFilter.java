package com.ecomerce.domain;

import java.time.OffsetDateTime;

public record PriceFilter(

    OffsetDateTime applyDate,
    Long productId,
    Long brandId

) { }
