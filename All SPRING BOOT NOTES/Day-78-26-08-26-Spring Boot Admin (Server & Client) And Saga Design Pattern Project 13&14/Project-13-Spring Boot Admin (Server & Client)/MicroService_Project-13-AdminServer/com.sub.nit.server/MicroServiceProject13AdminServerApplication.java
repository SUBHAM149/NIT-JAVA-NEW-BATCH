package com.sub.nit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroServiceProject13AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProject13AdminServerApplication.class, args);
	}

}

