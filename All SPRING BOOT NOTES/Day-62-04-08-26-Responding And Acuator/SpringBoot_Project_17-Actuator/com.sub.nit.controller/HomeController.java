package com.sub.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Actuator Demo";
    }

    @GetMapping("/about")
    public String about() {
        return "This project demonstrates Spring Boot Actuator Endpoints.";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact: subhambehera04.03.2005@gmail.com";
    }

}
