package com.ecomerce.infraestructure.database.mapper;

import com.ecomerce.domain.Price;
import com.ecomerce.infraestructure.database.model.PriceEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PriceEntityMapper {

  Price toDomain(PriceEntity entity);

}
