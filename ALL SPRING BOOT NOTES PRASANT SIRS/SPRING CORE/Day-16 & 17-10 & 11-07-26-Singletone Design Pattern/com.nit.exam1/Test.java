package com.nit.exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam1/applicationcontext.xml");

		University university = context.getBean("university", University.class);

		System.out.println(university);
	}
}
