package com.sub.nit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Product;
import com.sub.nit.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return service.getProductById(id);
    }

    @GetMapping("/all")
    public Iterable<Product> getAll() {
        return service.getAllProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return service.deleteProduct(id);
    }
}
