package com.sub.nit.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.employee.entity.Employee;
import com.sub.nit.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;


    // Get All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {

        List<Employee> employees = employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }


    // Get Employee By Id
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable Integer id) {

        Employee employee = employeeService.getEmployeeById(id);

        return ResponseEntity.ok(employee);
    }


    // Save Employee
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(
            @RequestBody Employee employee) {

        Employee savedEmployee =
                employeeService.saveEmployee(employee);

        return ResponseEntity.ok(savedEmployee);
    }


    // Update Employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee employee) {

        employee.setId(id);

        Employee updatedEmployee =
                employeeService.updateEmployee(employee);

        return ResponseEntity.ok(updatedEmployee);
    }


    // Delete Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable Integer id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.ok("Employee deleted successfully");
    }

}
