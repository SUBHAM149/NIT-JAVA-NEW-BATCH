package com.sub.nit.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.jpa.entity.Product;
import com.sub.nit.jpa.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Iterable<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(int id, Product product) {

        Product pro = repository.findById(id).orElse(null);

        if (pro != null) {

            pro.setName(product.getName());
            pro.setBrand(product.getBrand());
            pro.setCategory(product.getCategory());
            pro.setPrice(product.getPrice());
            pro.setQuantity(product.getQuantity());

            return repository.save(pro);
        }

        return null;
    }

    @Override
    public void deleteProduct(int id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
