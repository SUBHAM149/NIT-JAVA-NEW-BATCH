package com.nit.service;

public class PaytmPayment implements PaymentGateway {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of ₹" + amount + " completed through Paytm.");
	}

}
