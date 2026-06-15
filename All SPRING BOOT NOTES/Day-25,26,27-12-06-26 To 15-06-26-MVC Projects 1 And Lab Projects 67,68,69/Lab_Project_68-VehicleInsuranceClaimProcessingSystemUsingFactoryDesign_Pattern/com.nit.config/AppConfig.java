package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.factory.InsuranceFactory;

@Configuration
public class AppConfig {

    @Bean
    public InsuranceFactory insuranceFactory() {
        return new InsuranceFactory();
    }

}
