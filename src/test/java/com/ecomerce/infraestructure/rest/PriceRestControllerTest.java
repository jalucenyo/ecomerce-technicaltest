package com.ecomerce.infraestructure.rest;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PriceRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("Test 1: peticion a las 10:00 del dia 14 del producto 35455 para la brand 1 (ZARA)")
  void test1() throws Exception {

    mockMvc.perform(
        get("/api/v1/prices")
            .param("applyDate", String.valueOf(OffsetDateTime.parse("2020-06-14T10:00:00Z")))
            .param("productId", "35455")
            .param("brandId", "1")
        )
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.productId").value(35455))
        .andExpect(jsonPath("$.price").value(35.50))
        .andReturn();
  }

  @Test
  @DisplayName("Test 2: peticion a las 16:00 del dia 14 del producto 35455 para la brand 1 (ZARA)")
  void test2() throws Exception {

    mockMvc.perform(
            get("/api/v1/prices")
                .param("applyDate", String.valueOf(OffsetDateTime.parse("2020-06-14T16:00:00Z")))
                .param("productId", "35455")
                .param("brandId", "1")
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.productId").value(35455))
        .andExpect(jsonPath("$.price").value(25.45))
        .andReturn();
  }

  @Test
  @DisplayName("Test 3: peticion a las 21:00 del dia 14 del producto 35455 para la brand 1 (ZARA)")
  void test3() throws Exception {

    mockMvc.perform(
            get("/api/v1/prices")
                .param("applyDate", String.valueOf(OffsetDateTime.parse("2020-06-14T21:00:00Z")))
                .param("productId", "35455")
                .param("brandId", "1")
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.productId").value(35455))
        .andExpect(jsonPath("$.price").value(35.50))
        .andReturn();
  }

  @Test
  @DisplayName("Test 4: peticion a las 10:00 del dia 15 del producto 35455 para la brand 1 (ZARA)")
  void test4() throws Exception {

    mockMvc.perform(
            get("/api/v1/prices")
                .param("applyDate", String.valueOf(OffsetDateTime.parse("2020-06-15T10:00:00Z")))
                .param("productId", "35455")
                .param("brandId", "1")
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.productId").value(35455))
        .andExpect(jsonPath("$.price").value(30.50))
        .andReturn();
  }

  @Test
  @DisplayName("Test 5: peticion a las 21:00 del dia 16 del producto 35455 para la brand 1 (ZARA)")
  void test5() throws Exception {

    mockMvc.perform(
            get("/api/v1/prices")
                .param("applyDate", String.valueOf(OffsetDateTime.parse("2020-06-21T16:00:00Z")))
                .param("productId", "35455")
                .param("brandId", "1")
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.productId").value(35455))
        .andExpect(jsonPath("$.price").value(38.95))
        .andReturn();
  }

}
