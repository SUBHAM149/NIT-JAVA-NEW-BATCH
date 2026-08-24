package com.sub.nit;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sub.nit.entity.Employee;
import com.sub.nit.entity.IdentityCard;
import com.sub.nit.service.EmployeeService;

public class App {

	public static void main(String[] args) {

		// Load Spring configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get EmployeeService object from Spring
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		// ---------------- Employee 1 ----------------

		IdentityCard card1 = new IdentityCard(501, "ID10001", LocalDate.of(2026, 1, 15));

		Employee employee1 = new Employee(101, "Rahul", 55000, card1);

		employeeService.saveEmployee(employee1);

		// ---------------- Employee 2 ----------------

		IdentityCard card2 = new IdentityCard(502, "ID10002", LocalDate.of(2026, 2, 10));

		Employee employee2 = new Employee(102, "Raj", 60000, card2);

		employeeService.saveEmployee(employee2);

		// ---------------- Retrieve Employee ----------------

		Employee employee = employeeService.getEmployeeById(101);

		// Display Employee Details
		System.out.println("Employee ID: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());

		// Display Identity Card Details
		IdentityCard card = employee.getIdentityCard();

		System.out.println();
		System.out.println("Identity Card Details:");
		System.out.println("Card ID: " + card.getCardId());
		System.out.println("Card Number: " + card.getCardNumber());
		System.out.println("Issue Date: " + card.getIssueDate());

		// Close Spring Context
		((ClassPathXmlApplicationContext) context).close();
	}
}
