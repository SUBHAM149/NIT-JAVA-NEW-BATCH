package com.example.jwtproject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwtproject.entity.Employee;
import com.example.jwtproject.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		return ResponseEntity.ok(employeeService.saveEmployee(employee));
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {

		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {

		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {

		return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {

		return ResponseEntity.ok(employeeService.deleteEmployee(id));
	}
}
