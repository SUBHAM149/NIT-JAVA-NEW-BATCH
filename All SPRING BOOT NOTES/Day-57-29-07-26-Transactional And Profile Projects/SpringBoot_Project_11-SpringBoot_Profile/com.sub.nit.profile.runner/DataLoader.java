package com.sub.nit.profile.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Override
    public void run(String... args) {

        System.out.println("-------------------------");
        System.out.println("Application Started");
        System.out.println("-------------------------");

    }

}
