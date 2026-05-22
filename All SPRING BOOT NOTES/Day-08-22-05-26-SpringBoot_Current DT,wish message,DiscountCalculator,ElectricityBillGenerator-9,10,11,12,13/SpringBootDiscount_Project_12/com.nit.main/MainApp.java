package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.DiscountCalculator;

public class MainApp {

	public static void main(String[] args) {

		// Load IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get Bean
		DiscountCalculator dc = ctx.getBean("dc", DiscountCalculator.class);

		// Call Method
		double result = dc.calculateDiscount();

		System.out.println("Discounted Price : " + result);

		// Close Container
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
OUTPUT
------
Discounted Price : 90.0
