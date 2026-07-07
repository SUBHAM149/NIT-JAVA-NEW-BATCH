package com.sub.program03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		 ApplicationContext context =
	                new ClassPathXmlApplicationContext(
	                        "com/sub/program03/applicationContext3.xml");

		Teacher teacher = context.getBean("teacher", Teacher.class);

		teacher.display();

	}
}
