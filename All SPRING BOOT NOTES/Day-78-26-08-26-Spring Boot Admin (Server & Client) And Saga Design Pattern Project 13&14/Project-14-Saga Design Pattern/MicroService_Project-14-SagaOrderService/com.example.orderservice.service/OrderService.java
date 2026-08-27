package com.example.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final RestClient restClient;

    public OrderService(OrderRepository orderRepository,
                        RestClient restClient) {

        this.orderRepository = orderRepository;
        this.restClient = restClient;
    }

    // Create Order
    public Order createOrder(Order order) {

        // Step 1: Create Order
        order.setStatus("CREATED");

        Order savedOrder = orderRepository.save(order);

        // Step 2: Call Payment Service
        try {

            PaymentResponse paymentResponse = restClient.post()
                    .uri("http://localhost:8082/payments")
                    .body(new PaymentRequest(
                            savedOrder.getId(),
                            savedOrder.getAmount()))
                    .retrieve()
                    .body(PaymentResponse.class);

            // Step 3: Check Payment
            if (paymentResponse != null
                    && "SUCCESS".equals(paymentResponse.status())) {

                savedOrder.setStatus("PAID");

            } else {

                savedOrder.setStatus("CANCELLED");
            }

        } catch (Exception e) {

            // Compensation
            savedOrder.setStatus("CANCELLED");
        }

        return orderRepository.save(savedOrder);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Integer id) {
        return orderRepository.findById(id)
                .orElse(null);
    }

    public Order updateStatus(Integer id, String status) {

        Order order = orderRepository.findById(id)
                .orElse(null);

        if (order != null) {
            order.setStatus(status);
            return orderRepository.save(order);
        }

        return null;
    }

    // Payment Request
    public record PaymentRequest(
            Integer orderId,
            double amount) {
    }

    // Payment Response
    public record PaymentResponse(
            Integer id,
            Integer orderId,
            double amount,
            String status) {
    }
}
