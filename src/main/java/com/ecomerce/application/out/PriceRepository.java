package com.ecomerce.application.out;

import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;

import java.util.Optional;

public interface PriceRepository {

  Optional<Price> find(PriceFilter filter);

}
