 package com.sub.program02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sub.program01.Book;
import com.sub.program02.Employee;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/sub/program02/applicationContext2.xml");

		Employee employee = context2.getBean("employeeData", Employee.class);

		System.out.println(employee);
	}
}
