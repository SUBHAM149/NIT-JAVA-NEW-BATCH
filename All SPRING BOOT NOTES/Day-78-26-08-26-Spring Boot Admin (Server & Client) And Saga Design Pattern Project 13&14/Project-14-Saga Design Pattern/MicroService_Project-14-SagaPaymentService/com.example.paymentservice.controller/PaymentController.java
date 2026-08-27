package com.example.paymentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Process Payment
    @PostMapping
    public Payment processPayment(@RequestBody Payment payment) {

        return paymentService.processPayment(payment);
    }

    // Get All Payments
    @GetMapping
    public List<Payment> getAllPayments() {

        return paymentService.getAllPayments();
    }

    // Get Payment By ID
    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Integer id) {

        return paymentService.getPaymentById(id);
    }

    // Refund Payment
    @PutMapping("/{id}/refund")
    public Payment refundPayment(@PathVariable Integer id) {

        return paymentService.refundPayment(id);
    }
}
