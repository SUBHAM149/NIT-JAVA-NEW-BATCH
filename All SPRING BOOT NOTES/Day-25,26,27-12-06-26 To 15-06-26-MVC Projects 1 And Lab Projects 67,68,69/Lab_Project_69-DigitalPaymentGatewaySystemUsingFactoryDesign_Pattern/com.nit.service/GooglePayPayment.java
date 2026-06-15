package com.nit.service;

public class GooglePayPayment implements PaymentGateway {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of ₹" + amount + " completed through Google Pay.");
	}

}
