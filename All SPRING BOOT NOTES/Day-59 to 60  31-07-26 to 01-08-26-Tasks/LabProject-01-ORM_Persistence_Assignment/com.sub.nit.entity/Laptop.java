package com.sub.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;

    private String brand;

    private String processor;

    private Double price;

    // Default Constructor
    public Laptop() {
    }

    // Parameterized Constructor
    public Laptop(Integer laptopId, String brand, String processor, Double price) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    // Getters and Setters
    public Integer getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(Integer laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [laptopId=" + laptopId + ", brand=" + brand
                + ", processor=" + processor + ", price=" + price + "]";
    }
}
