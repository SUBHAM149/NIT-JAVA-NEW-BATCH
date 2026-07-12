package com.nit.exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam2/applicationContext.xml");

		Customer customer = context.getBean("customer", Customer.class);

		System.out.println(customer);
	}
}
