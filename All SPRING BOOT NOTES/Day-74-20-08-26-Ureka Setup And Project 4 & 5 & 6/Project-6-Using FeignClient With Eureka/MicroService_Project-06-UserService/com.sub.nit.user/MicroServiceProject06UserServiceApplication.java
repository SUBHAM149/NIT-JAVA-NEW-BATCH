package com.sub.nit.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroServiceProject06UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProject06UserServiceApplication.class, args);
	}

}
