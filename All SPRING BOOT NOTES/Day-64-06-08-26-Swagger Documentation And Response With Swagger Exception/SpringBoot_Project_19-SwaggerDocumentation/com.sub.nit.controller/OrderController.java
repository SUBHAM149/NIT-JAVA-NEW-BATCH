package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Order;
import com.sub.nit.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/orders")
@Tag(name = "Order REST API", description = "CRUD Operations for Order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Save Order
    @PostMapping
    @Operation(summary = "Save Order", description = "Create a new Order")
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    // Get All Orders
    @GetMapping
    @Operation(summary = "Get All Orders", description = "Fetch all Orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Get Order By Id
    @GetMapping("/{id}")
    @Operation(summary = "Get Order By ID", description = "Fetch Order using ID")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    // Update Order
    @PutMapping("/{id}")
    @Operation(summary = "Update Order", description = "Update an existing Order")
    public Order updateOrder(@PathVariable Integer id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    // Delete Order
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete Order", description = "Delete Order using ID")
    public String deleteOrder(@PathVariable Integer id) {
        return orderService.deleteOrder(id);
    }
}
