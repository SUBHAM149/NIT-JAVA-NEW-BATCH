package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("walletPayment")
public class WalletPayment implements PaymentMethod {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Wallet";
    }
}
