package com.sub.nit.redis.controller;

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

import com.sub.nit.redis.entity.Employee;
import com.sub.nit.redis.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// CREATE
	@Operation(summary = "Create Employee", description = "Creates a new employee.")
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

		Employee savedEmployee = employeeService.saveEmployee(employee);

		return ResponseEntity.ok(savedEmployee);
	}

	// GET ALL
	@Operation(summary = "Get All Employees", description = "Returns all employees.")
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> employees = employeeService.getAllEmployees();

		return ResponseEntity.ok(employees);
	}

	// GET BY ID
	@Operation(summary = "Get Employee By ID", description = "Returns an employee using employee ID.")
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(

			@Parameter(description = "Employee ID", example = "1", required = true) @PathVariable Integer id) {

		Employee employee = employeeService.getEmployeeById(id);

		if (employee != null) {
			return ResponseEntity.ok(employee);
		}

		return ResponseEntity.notFound().build();
	}

	// UPDATE
	@Operation(summary = "Update Employee", description = "Updates an existing employee.")
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(

			@Parameter(description = "Employee ID", example = "1", required = true) @PathVariable Integer id,

			@RequestBody Employee employee) {

		Employee updatedEmployee = employeeService.updateEmployee(id, employee);

		if (updatedEmployee != null) {
			return ResponseEntity.ok(updatedEmployee);
		}

		return ResponseEntity.notFound().build();
	}

	// DELETE
	@Operation(summary = "Delete Employee", description = "Deletes an employee.")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(

			@Parameter(description = "Employee ID", example = "1", required = true) @PathVariable Integer id) {

		employeeService.deleteEmployee(id);

		return ResponseEntity.ok("Employee deleted successfully");
	}
}
