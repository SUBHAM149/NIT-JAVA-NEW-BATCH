package com.sub.nit.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {

    private final RestTemplate template = new RestTemplate();

    public String getProduct(int id) {

        String url = "http://localhost:8080/product/" + id;

        return template.getForObject(url, String.class);
    }
}
