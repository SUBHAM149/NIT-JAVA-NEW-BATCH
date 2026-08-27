package com.example.paymentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Process Payment
    public Payment processPayment(Payment payment) {

        // Simple payment logic
        if (payment.getAmount() > 0) {
            payment.setStatus("SUCCESS");
        } else {
            payment.setStatus("FAILED");
        }

        return paymentRepository.save(payment);
    }

    // Get All Payments
    public List<Payment> getAllPayments() {

        return paymentRepository.findAll();
    }

    // Get Payment By ID
    public Payment getPaymentById(Integer id) {

        return paymentRepository.findById(id)
                .orElse(null);
    }

    // Refund Payment
    public Payment refundPayment(Integer id) {

        Payment payment = paymentRepository.findById(id)
                .orElse(null);

        if (payment != null && payment.getStatus().equals("SUCCESS")) {

            payment.setStatus("REFUNDED");

            return paymentRepository.save(payment);
        }

        return null;
    }
}
