package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class PaytmPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm");
    }
}
