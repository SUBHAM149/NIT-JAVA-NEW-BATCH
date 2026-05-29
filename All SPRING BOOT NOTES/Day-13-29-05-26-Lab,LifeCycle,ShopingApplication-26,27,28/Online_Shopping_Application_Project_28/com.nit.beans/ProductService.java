package com.nit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ProductService {

    
    public ProductService() {
        System.out.println("ProductService Bean Created");
    }

    
    @PostConstruct
    public void init() {
        System.out.println("Loading Product Data...");
        System.out.println("Online Shopping Application Started Successfully");
    }

   
    @PreDestroy
    public void destroy() {
        System.out.println("Releasing Product Resources...");
        System.out.println("Online Shopping Application Closed Successfully");
    }
}
