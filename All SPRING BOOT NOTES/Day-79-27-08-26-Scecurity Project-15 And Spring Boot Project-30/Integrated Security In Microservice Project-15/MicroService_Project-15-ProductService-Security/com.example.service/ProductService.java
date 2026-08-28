package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getProducts() {
        return "Product list";
    }
}
