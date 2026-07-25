package com.nit.employee.exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = context.getBean(Employee.class);

		emp.calculateSalary();

		context.close();
	}

}
