package com.nit.service;

public class PhonePePayment implements PaymentGateway {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of ₹" + amount + " completed through PhonePe.");
	}

}
