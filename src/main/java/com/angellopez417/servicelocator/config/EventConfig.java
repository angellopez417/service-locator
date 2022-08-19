package com.angellopez417.servicelocator.config;

import com.angellopez417.servicelocator.factory.EventFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {
  @Bean("eventFactory")
  public FactoryBean serviceLocatorFactoryBean() {
    ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
    factoryBean.setServiceLocatorInterface(EventFactory.class);
    return factoryBean;
  }
}
