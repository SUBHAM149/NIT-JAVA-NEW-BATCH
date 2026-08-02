package com.sub.nit.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Product;
import com.sub.nit.repository.ProductRepository;
import com.sub.nit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public String deleteProduct(Integer id) {
        repository.deleteById(id);
        return "Product Deleted Successfully";
    }
}
