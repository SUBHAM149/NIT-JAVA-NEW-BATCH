package com.nit.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nit.security.entity.Employee;
import com.nit.security.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
@Tag(
    name = "Employee REST API",
    description = "CRUD Operations for Employee Management"
)
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @Operation(
        summary = "Get All Employees",
        description = "Retrieve all employee records from the database."
    )
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @Operation(
        summary = "Get Employee By ID",
        description = "Retrieve an employee using the employee ID."
    )
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @Operation(
        summary = "Add Employee",
        description = "Create a new employee record."
    )
    @PostMapping
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @Operation(
        summary = "Update Employee",
        description = "Update an existing employee using the employee ID."
    )
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @Valid @RequestBody Employee employee) {

        employee.setId(id);
        return service.updateEmployee(employee);
    }

    @Operation(
        summary = "Delete Employee",
        description = "Delete an employee using the employee ID."
    )
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {

        service.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }
}
