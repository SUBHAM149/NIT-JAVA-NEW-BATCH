package com.sub.nit.profile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ProfileConfig {

    public ProfileConfig() {
        System.out.println("Development Profile Loaded");
    }

}
