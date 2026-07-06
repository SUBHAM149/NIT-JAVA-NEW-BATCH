package com.sub.day10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/day10/application-context.xml");
		Robot bean = context.getBean("robot", Robot.class);
		System.out.println(bean);
	}
}
