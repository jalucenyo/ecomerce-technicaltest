package com.ecomerce.infraestructure.database.repository;

import com.ecomerce.application.out.PriceRepository;
import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;
import com.ecomerce.infraestructure.database.mapper.PriceEntityMapper;
import com.ecomerce.infraestructure.database.repository.jpa.JpaPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SpringDataPriceRepository implements PriceRepository {

  private final JpaPriceRepository repository;
  private final PriceEntityMapper mapper;

  @Override
  public List<Price> find(PriceFilter filter) {

    return repository.findPriceApplyDate(
        filter.productId(), filter.brandId(), filter.applyDate())
        .map(mapper::toDomain)
        .toList();
  }

}
