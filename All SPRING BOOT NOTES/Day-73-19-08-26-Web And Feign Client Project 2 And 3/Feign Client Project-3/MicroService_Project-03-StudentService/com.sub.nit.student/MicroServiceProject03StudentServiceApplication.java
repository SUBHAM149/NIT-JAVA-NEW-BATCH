package com.sub.nit.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroServiceProject03StudentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProject03StudentServiceApplication.class, args);
    }
}
