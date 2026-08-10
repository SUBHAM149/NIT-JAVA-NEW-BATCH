package com.nit.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.security.entity.Employee;
import com.nit.security.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	// Get All Employees
	public List<Employee> getAllEmployees() {

		return repository.findAll();

	}

	// Save Employee
	public Employee saveEmployee(Employee employee) {

		return repository.save(employee);

	}

	// Get Employee By Id
	public Employee getEmployeeById(int id) {

		return repository.findById(id).orElse(null);

	}

	// Update Employee
	public Employee updateEmployee(Employee employee) {

		return repository.save(employee);

	}

	// Delete Employee
	public void deleteEmployee(int id) {

		Employee employee = repository.findById(id).orElse(null);

		if (employee != null) {

			repository.delete(employee);

		}

	}

}
