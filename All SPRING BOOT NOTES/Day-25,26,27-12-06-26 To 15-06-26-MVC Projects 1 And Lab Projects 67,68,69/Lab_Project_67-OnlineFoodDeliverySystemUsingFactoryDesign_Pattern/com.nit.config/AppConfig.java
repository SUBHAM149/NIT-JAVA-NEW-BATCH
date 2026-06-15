package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.factory.FoodDeliveryFactory;

@Configuration
public class AppConfig {

    @Bean
    public FoodDeliveryFactory foodDeliveryFactory() {
        return new FoodDeliveryFactory();
    }
}
