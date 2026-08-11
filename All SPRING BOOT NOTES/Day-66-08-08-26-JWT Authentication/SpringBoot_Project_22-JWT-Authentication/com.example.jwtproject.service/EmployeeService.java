package com.example.jwtproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jwtproject.entity.Employee;
import com.example.jwtproject.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Long id) {

		return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
	}

	public Employee updateEmployee(Long id, Employee employee) {

		Employee existing = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));

		existing.setName(employee.getName());
		existing.setDepartment(employee.getDepartment());
		existing.setSalary(employee.getSalary());
		existing.setEmail(employee.getEmail());

		return employeeRepository.save(existing);
	}

	public String deleteEmployee(Long id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));

		employeeRepository.delete(employee);

		return "Employee deleted successfully";
	}
}
