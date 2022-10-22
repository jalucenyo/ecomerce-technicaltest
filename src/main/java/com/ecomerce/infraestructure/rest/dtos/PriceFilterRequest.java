package com.ecomerce.infraestructure.rest.dtos;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public record PriceFilterRequest(

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @NotNull
    OffsetDateTime applyDate,

    @NotNull
    Long productId,

    @NotNull
    Long brandId

) { }
