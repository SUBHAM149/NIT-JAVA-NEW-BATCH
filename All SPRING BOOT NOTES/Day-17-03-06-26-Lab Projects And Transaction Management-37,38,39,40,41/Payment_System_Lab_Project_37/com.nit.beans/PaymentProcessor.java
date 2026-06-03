package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    @Autowired
    @Qualifier("googlePayService")
    private PaymentService paymentService;

    public void processPayment(double amount) {
        paymentService.pay(amount);
    }
}
