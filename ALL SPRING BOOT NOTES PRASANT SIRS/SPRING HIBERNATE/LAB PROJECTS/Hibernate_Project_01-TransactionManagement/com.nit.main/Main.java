package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.EmployeeService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService service = context.getBean(EmployeeService.class);

		service.addEmployee();

		System.out.println("Spring Hibernate Transaction Completed Successfully");

		context.close();
	}
}
