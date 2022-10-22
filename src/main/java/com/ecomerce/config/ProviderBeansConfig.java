package com.ecomerce.config;

import com.ecomerce.application.in.FindPrices;
import com.ecomerce.application.usecases.FindPricesUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderBeansConfig {

  @Bean
  public FindPrices provideFindPrices(){
    return new FindPricesUseCase();
  }

}
