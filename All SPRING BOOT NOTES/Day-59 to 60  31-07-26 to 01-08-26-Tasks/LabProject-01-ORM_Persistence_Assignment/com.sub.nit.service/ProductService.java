package com.sub.nit.service;
import com.sub.nit.entity.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product getProductById(Integer id);

    Iterable<Product> getAllProducts();

    String deleteProduct(Integer id);

}
