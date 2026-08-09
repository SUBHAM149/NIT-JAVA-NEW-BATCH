package com.sub.day24;

import org.springframework.stereotype.Component;

@Component
public class BankServerStartup {

    public BankServerStartup() {

        System.out.println("Server started");
        System.out.println("Security Verify");
        System.out.println("Database connected");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All set up done");
    }
}
