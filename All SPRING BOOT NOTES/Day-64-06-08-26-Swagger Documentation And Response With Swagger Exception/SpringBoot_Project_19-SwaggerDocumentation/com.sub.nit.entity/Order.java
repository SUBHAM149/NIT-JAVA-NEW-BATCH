package com.sub.nit.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
@Schema(description = "Order Entity")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Order ID", example = "101")
    private Integer id;

    @Schema(description = "Order Name", example = "Laptop")
    private String name;

    @Schema(description = "Order Cost", example = "55000")
    private Double cost;

    @Schema(description = "Order Description", example = "Dell Inspiron 15 Laptop")
    private String description;

    // Default Constructor
    public Order() {
    }

    // Parameterized Constructor
    public Order(Integer id, String name, Double cost, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for cost
    public Double getCost() {
        return cost;
    }

    // Setter for cost
    public void setCost(Double cost) {
        this.cost = cost;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", name=" + name + ", cost=" + cost
                + ", description=" + description + "]";
    }
}
