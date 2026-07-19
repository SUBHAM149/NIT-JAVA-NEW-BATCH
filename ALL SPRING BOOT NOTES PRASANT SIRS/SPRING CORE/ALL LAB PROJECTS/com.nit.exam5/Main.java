package com.nit.exam5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam5/applicationContext.xml");

		Car car = context.getBean("car", Car.class);

		car.display();
	}
}
