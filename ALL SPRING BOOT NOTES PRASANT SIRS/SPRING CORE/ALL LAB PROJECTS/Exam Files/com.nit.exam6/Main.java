package com.nit.exam6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam6/applicationContext.xml");

		Bank bank = context.getBean("bank", Bank.class);

		bank.display();
	}
}
