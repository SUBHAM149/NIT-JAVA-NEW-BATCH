package com.sub.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id) {

        return "Product ID: " + id;
    }
}
