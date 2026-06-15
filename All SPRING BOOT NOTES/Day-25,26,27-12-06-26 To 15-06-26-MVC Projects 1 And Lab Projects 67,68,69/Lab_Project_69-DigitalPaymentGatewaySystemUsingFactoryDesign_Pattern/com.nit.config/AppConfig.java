package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.factory.PaymentFactory;

@Configuration
public class AppConfig {

	@Bean
	public PaymentFactory paymentFactory() {
		return new PaymentFactory();
	}

}
