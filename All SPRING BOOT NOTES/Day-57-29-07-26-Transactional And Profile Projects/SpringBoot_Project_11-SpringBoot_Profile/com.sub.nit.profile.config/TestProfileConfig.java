package com.sub.nit.profile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfileConfig {

    public TestProfileConfig() {
        System.out.println("Test Profile Loaded");
    }

}
