package com.sub.nit.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.jpa.entity.Employee;
import com.sub.nit.jpa.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Save Employee
    @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping("/all")
    public Iterable<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    // Get Employee By ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    // Update Employee
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    // Delete Employee
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }
}
