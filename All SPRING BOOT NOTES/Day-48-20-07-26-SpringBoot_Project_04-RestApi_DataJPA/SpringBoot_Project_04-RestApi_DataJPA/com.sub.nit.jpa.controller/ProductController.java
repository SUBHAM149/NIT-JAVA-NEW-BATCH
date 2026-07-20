package com.sub.nit.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.jpa.entity.Product;
import com.sub.nit.jpa.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    // Save Product
    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // Get All Products
    @GetMapping("/all")
    public Iterable<Product> getAllProduct() {
        return service.getAllProduct();
    }

    // Get Product By Id
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // Update Product
    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id,
                                 @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    // Delete Product
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}
