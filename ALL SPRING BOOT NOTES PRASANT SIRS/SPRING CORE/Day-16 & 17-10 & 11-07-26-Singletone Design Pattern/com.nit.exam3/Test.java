package com.nit.exam3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam3/applicationContext.xml");

		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

		System.out.println(vehicle);
	}
}
