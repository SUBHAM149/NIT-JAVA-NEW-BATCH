package com.example.employee.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
@Tag(name = "Employee API", description = "Employee CRUD REST API")
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	// CREATE
	@PostMapping
	@Operation(summary = "Create Employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {

		Employee savedEmployee = service.saveEmployee(employee);

		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}

	// READ ALL
	@GetMapping
	@Operation(summary = "Get All Employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		return ResponseEntity.ok(service.getAllEmployees());
	}

	// READ BY ID
	@GetMapping("/{id}")
	@Operation(summary = "Get Employee By ID")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {

		return ResponseEntity.ok(service.getEmployeeById(id));
	}

	// FIND BY NAME
	@GetMapping("/name/{name}")
	@Operation(summary = "Find Employee By Name")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {

		return ResponseEntity.ok(service.getEmployeeByName(name));
	}

	// FIND BY EMAIL
	@GetMapping("/email/{email}")
	@Operation(summary = "Find Employee By Email")
	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable String email) {

		return ResponseEntity.ok(service.getEmployeeByEmail(email));
	}

	// UPDATE
	@PutMapping("/{id}")
	@Operation(summary = "Update Employee")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {

		return ResponseEntity.ok(service.updateEmployee(id, employee));
	}

	// DELETE
	@DeleteMapping("/{id}")
	@Operation(summary = "Delete Employee")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {

		service.deleteEmployee(id);

		return ResponseEntity.ok("Employee deleted successfully");
	}
}
