package com.sub.nit;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sub.nit.entity.Department;
import com.sub.nit.entity.Employee;
import com.sub.nit.service.DepartmentService;

public class App {

	public static void main(String[] args) {

		// Load Spring configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");

		// Get DepartmentService object
		DepartmentService departmentService = context.getBean("departmentService", DepartmentService.class);

		// ============================
		// Create Employees
		// ============================

		Employee employee1 = new Employee(101, "Rahul", 55000, "Java Developer");

		Employee employee2 = new Employee(102, "Raj", 60000, "Software Developer");

		Employee employee3 = new Employee(103, "Amit", 50000, "Tester");

		// ============================
		// Create Employee List
		// ============================

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

		// ============================
		// Create Department
		// ============================

		Department department = new Department(1, "IT Department", "Bangalore", employees);

		// ============================
		// Save Department
		// ============================

		departmentService.saveDepartment(department);

		System.out.println("Department and Employees saved successfully!");

		// ============================
		// Fetch Department
		// ============================

		Department result = departmentService.getDepartmentById(1);

		// ============================
		// Display Department
		// ============================

		System.out.println();
		System.out.println("========== Department Details ==========");

		System.out.println("Department ID: " + result.getDepartmentId());

		System.out.println("Department Name: " + result.getDepartmentName());

		System.out.println("Location: " + result.getLocation());

		// ============================
		// Display Employees
		// ============================

		System.out.println();
		System.out.println("========== Employee Details ==========");

		for (Employee employee : result.getEmployees()) {

			System.out.println("Employee ID: " + employee.getEmployeeId());

			System.out.println("Employee Name: " + employee.getEmployeeName());

			System.out.println("Salary: " + employee.getSalary());

			System.out.println("Designation: " + employee.getDesignation());

			System.out.println("--------------------------------------");
		}

		// Close Spring Context
		((ClassPathXmlApplicationContext) context).close();
	}
}
