package com.nit;

public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Debit Card");
    }
}
