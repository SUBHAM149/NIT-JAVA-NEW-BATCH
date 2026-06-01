package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Object obj = ctx.getBean("cid");

		System.out.println(obj);
	}
}
OUTPUT
------
Car [c_name=BMW, c_mum=258632, engine=Engine [e_name=Petrol Engine, price=20000.0]]
