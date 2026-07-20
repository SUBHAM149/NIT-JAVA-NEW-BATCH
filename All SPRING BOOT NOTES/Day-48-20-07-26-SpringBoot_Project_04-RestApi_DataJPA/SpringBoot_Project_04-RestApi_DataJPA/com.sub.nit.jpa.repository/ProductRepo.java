package com.sub.nit.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.jpa.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
