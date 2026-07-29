package com.sub.nit.profile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdProfileConfig {

    public ProdProfileConfig() {
        System.out.println("Production Profile Loaded");
    }

}
