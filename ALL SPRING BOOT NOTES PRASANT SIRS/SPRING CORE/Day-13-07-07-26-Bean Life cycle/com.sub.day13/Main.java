package com.sub.day13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =

				new ClassPathXmlApplicationContext("com/sub/day13/application-context.xml");
		A bean = context.getBean("a", A.class);
		System.out.println(bean);
		context.close();
	}
}
