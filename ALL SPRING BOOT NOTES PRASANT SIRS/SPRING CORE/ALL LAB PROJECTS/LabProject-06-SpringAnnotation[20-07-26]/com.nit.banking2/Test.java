package com.nit.banking2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BankOperation bank = context.getBean(BankOperation.class);

		bank.menu();

		context.close();
	}
}
