package com.shopping8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;

    public void placeOrder() {

        System.out.println("Order Placed.");

        paymentService.makePayment();

        System.out.println("Thank you for Shopping.");

    }

}
