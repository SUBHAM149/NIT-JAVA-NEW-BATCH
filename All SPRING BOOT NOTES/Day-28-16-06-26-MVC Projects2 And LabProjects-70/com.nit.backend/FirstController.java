package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "helloPage";
    }
}
