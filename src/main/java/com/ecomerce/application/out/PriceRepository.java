package com.ecomerce.application.out;

import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;

import java.util.List;

public interface PriceRepository {

  List<Price> find(PriceFilter filter);

}
