package com.sub.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {

        SpringApplication.run(BankingApplication.class, args);

        System.out.println("==========================================");
        System.out.println("     BANKING REST API STARTED SUCCESSFULLY");
        System.out.println("==========================================");

    }

}
