package com.sub.nit.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.product.entity.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {

        if (id == 1) {

            return new Product(1, "Laptop", 50000);

        } else if (id == 2) {

            return new Product(2, "Mobile", 30000);

        } else if (id == 3) {

            return new Product(3, "Headphones", 5000);

        }

        return null;
    }
}
