package com.ecomerce.application.usecases;

import com.ecomerce.application.in.FindPrices;
import com.ecomerce.application.out.PriceRepository;
import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;
import com.ecomerce.domain.exception.NotFoundException;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class FindPricesUseCase implements FindPrices {

  private final PriceRepository repository;

  @Override
  public Price apply(PriceFilter filters) {
    return repository.find(filters).stream()
        .findFirst()
        .orElseThrow(NotFoundException::new);
  }
}
