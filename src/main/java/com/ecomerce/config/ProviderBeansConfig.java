package com.ecomerce.config;

import com.ecomerce.application.in.FindPrices;
import com.ecomerce.application.out.PriceRepository;
import com.ecomerce.application.usecases.FindPricesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class ProviderBeansConfig {

  private final PriceRepository priceRepository;

  @Bean
  public FindPrices provideFindPrices(){
    return new FindPricesUseCase(priceRepository);
  }

}
