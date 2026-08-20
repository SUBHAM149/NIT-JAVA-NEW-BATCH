package com.sub.nit.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceProject05PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProject05PaymentServiceApplication.class, args);
	}

}
