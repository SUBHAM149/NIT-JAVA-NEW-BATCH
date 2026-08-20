package com.sub.nit.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceProject04EurekaServerSetUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProject04EurekaServerSetUpApplication.class, args);
	}

}
