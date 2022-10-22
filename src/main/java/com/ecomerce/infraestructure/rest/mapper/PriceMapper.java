package com.ecomerce.infraestructure.rest.mapper;

import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;
import com.ecomerce.infraestructure.rest.dtos.PriceFilterRequest;
import com.ecomerce.infraestructure.rest.dtos.PriceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

  PriceFilter toDomain(PriceFilterRequest request);

  PriceResponse toResponse(Price price);

}
