package com.sub.nit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceProject07ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProject07ApiGatewayApplication.class, args);
	}
}
