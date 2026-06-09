package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.service.EmployeeService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.nit");

		EmployeeService service = context.getBean(EmployeeService.class);

		service.updateEmployee();

	}
}
