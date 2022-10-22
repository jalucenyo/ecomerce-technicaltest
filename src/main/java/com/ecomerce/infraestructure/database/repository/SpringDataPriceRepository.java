package com.ecomerce.infraestructure.database.repository;

import com.ecomerce.application.out.PriceRepository;
import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class SpringDataPriceRepository implements PriceRepository {

  @Override
  public Optional<Price> find(PriceFilter filter) {
    return Optional.empty();
  }

}
