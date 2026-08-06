package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Customer;
import com.sub.nit.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/customers")
@Tag(name = "Customer Management API", description = "CRUD Operations for Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// SAVE CUSTOMER

	@Operation(summary = "Save Customer", description = "Create a new customer record")
	@ApiResponse(responseCode = "201", description = "Customer created successfully")
	@PostMapping
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {

		Customer savedCustomer = customerService.saveCustomer(customer);

		return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
	}

	// GET ALL CUSTOMERS

	@Operation(summary = "Get All Customers", description = "Fetch all customer details")
	@ApiResponse(responseCode = "200", description = "Customers fetched successfully")
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers() {

		List<Customer> customers = customerService.getAllCustomers();

		return new ResponseEntity<>(customers, HttpStatus.OK);
	}

	// GET CUSTOMER BY ID

	@Operation(summary = "Get Customer By ID", description = "Fetch customer details using customer id")
	@ApiResponse(responseCode = "200", description = "Customer found")
	@ApiResponse(responseCode = "404", description = "Customer not found")
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {

		Customer customer = customerService.getCustomerById(id);

		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	// UPDATE CUSTOMER

	@Operation(summary = "Update Customer", description = "Update existing customer information")
	@ApiResponse(responseCode = "200", description = "Customer updated successfully")
	@PutMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {

		Customer updatedCustomer = customerService.updateCustomer(id, customer);

		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	}

	// DELETE CUSTOMER

	@Operation(summary = "Delete Customer", description = "Delete customer using customer id")
	@ApiResponse(responseCode = "200", description = "Customer deleted successfully")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) {

		String message = customerService.deleteCustomer(id);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
