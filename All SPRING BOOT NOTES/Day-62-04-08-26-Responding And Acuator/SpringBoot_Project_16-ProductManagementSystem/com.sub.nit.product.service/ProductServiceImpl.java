package com.sub.nit.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.product.entity.Product;
import com.sub.nit.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override 
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product updateProduct(Integer id, Product product) {

        Product existingProduct = repository.findById(id).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());

            return repository.save(existingProduct);
        }

        return null;
    }

    @Override
    public String deleteProductById(Integer id) {

        Product product = repository.findById(id).orElse(null);

        if (product != null) {
            repository.deleteById(id);
            return "Product Deleted Successfully...";
        }

        return "Product Not Found...";
    }

}
