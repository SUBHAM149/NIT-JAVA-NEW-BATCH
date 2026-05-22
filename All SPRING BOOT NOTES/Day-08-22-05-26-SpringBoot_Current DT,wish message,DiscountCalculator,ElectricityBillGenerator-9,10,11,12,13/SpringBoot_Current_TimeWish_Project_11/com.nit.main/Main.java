package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WishMessage;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		WishMessage generator = ctx.getBean("wmg", WishMessage.class);

		
		String message = generator.generateWishMessage();

		
		System.out.println(message);

		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
OUTPUT
------
Good Afternoon
