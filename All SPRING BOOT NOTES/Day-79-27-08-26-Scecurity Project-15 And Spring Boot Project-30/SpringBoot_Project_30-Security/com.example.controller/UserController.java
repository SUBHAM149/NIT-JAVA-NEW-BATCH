package com.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String hello(Authentication authentication) {

        return "Hello " +
                authentication.getName() +
                ", you are authenticated using JWT!";
    }

    @GetMapping("/profile")
    public String profile(Authentication authentication) {

        return "Welcome to your profile. Logged in as: "
                + authentication.getName();
    }
}
