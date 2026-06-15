package com.nit.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.factory.PaymentFactory;
import com.nit.service.PaymentGateway;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Gateway Type (PHONEPE/GPAY/PAYTM):");
		String gatewayType = sc.nextLine();

		System.out.println("Enter Amount:");
		double amount = sc.nextDouble();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PaymentFactory factory = context.getBean(PaymentFactory.class);

		PaymentGateway gateway = factory.getPaymentGateway(gatewayType);

		if (gateway != null) {
			gateway.makePayment(amount);
		} else {
			System.out.println("Invalid Payment Gateway");
		}

		sc.close();
	}
}
