package com.ecomerce.infraestructure.rest;

import com.ecomerce.application.in.FindPrices;
import com.ecomerce.infraestructure.rest.dtos.PriceFilterRequest;
import com.ecomerce.infraestructure.rest.dtos.PriceResponse;
import com.ecomerce.infraestructure.rest.mapper.PriceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/prices")
@RequiredArgsConstructor
public class PriceRestController {

  private final FindPrices findPrices;
  private final PriceMapper mapper;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public PriceResponse find(@Valid PriceFilterRequest filter){
    return mapper.toResponse(findPrices.apply(mapper.toDomain(filter)));
  }

}
