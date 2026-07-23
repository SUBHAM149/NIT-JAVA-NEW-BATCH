package com.sub.movieticket2;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    public void makePayment() {
        System.out.println("Payment Completed");
    }
}
