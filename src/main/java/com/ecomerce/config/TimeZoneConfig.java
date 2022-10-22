package com.ecomerce.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Configuration
public class TimeZoneConfig {

  @PostConstruct
  public void timeZoneConfig(){
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }

}
