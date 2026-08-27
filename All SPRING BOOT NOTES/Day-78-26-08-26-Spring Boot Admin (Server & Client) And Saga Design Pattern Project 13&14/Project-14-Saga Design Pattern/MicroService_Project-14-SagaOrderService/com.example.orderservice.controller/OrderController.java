package com.example.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Create Order
    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        return orderService.createOrder(order);
    }

    // Get All Orders
    @GetMapping
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();
    }

    // Get Order By ID
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id) {

        return orderService.getOrderById(id);
    }

    // Update Order Status
    @PutMapping("/{id}/status")
    public Order updateStatus(
            @PathVariable Integer id,
            @RequestParam String status) {

        return orderService.updateStatus(id, status);
    }
}
