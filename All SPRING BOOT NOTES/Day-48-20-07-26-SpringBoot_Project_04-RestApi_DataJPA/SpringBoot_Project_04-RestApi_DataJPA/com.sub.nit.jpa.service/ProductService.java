package com.sub.nit.jpa.service;

import com.sub.nit.jpa.entity.Product;

public interface ProductService {

    // Save Product
    public Product saveProduct(Product product);

    // Get All Products
    public Iterable<Product> getAllProduct();

    // Get Product By Id
    public Product getProductById(int id);

    // Update Product
    public Product updateProduct(int id, Product product);

    // Delete Product
    public void deleteProduct(int id);

}
