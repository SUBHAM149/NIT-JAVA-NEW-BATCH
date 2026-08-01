package com.sub.nit.repository;

import org.springframework.data.repository.CrudRepository;
import com.sub.nit.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
