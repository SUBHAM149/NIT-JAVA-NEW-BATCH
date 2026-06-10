package com.nit;

public class Test {

	public static void main(String[] args) {

		PaymentContext p1 = new PaymentContext(new DebitCardPayment());
		p1.makePayment(5000);

		PaymentContext p2 = new PaymentContext(new CreditCardPayment());
		p2.makePayment(10000);

		PaymentContext p3 = new PaymentContext(new UpiPayment());
		p3.makePayment(2000);
	}
}
