package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements PaymentMethod {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Card";
    }
}
