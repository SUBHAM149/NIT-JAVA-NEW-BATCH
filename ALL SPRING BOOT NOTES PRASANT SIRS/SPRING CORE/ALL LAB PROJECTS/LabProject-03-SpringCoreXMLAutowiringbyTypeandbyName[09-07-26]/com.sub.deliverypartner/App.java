package com.sub.deliverypartner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/deliverypartner/application-context.xml");

		Order order = context.getBean("order", Order.class);

		order.displayOrderDetails();
	}
}
