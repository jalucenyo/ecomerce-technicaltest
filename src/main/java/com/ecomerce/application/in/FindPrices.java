package com.ecomerce.application.in;

import com.ecomerce.domain.Price;
import com.ecomerce.domain.PriceFilter;

public interface FindPrices {

  Price apply(PriceFilter filters);

}
