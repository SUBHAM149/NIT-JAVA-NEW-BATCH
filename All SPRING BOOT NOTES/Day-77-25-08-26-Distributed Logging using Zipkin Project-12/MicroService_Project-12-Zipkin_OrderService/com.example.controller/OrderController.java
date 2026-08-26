package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private RestTemplate template;

    public OrderController(RestTemplate template) {
        super();
        this.template = template;
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable int id) {

        String user = template.getForObject(
                "http://localhost:8082/users/" + id,
                String.class
        );

        String product = template.getForObject(
                "http://localhost:8083/products/" + id,
                String.class
        );

        return "Order:" + id + ":" + user + ":" + product;
    }
}
