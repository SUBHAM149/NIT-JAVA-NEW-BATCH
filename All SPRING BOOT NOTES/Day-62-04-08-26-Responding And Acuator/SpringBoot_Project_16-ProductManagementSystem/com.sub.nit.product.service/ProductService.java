package com.sub.nit.product.service;

import java.util.List;

import com.sub.nit.product.entity.Product;

public interface ProductService {

    // Save Product
   public Product saveProduct(Product product);

    // Get Product By Id
   public Product getProductById(Integer id);

    // Get All Products
   public List<Product> getAllProducts();

    // Update Product
   public Product updateProduct(Integer id, Product product);

    // Delete Product
  public String deleteProductById(Integer id);
}
