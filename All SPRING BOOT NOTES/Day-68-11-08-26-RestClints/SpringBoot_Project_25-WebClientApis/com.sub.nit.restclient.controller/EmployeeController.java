package com.sub.nit.restclient.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.restclient.entity.Employee;
import com.sub.nit.restclient.service.EmployeeService;

@RestController
@RequestMapping("/webclient/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // POST - Create Employee
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // GET - Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // GET - Get Employee By ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable int id) {

        Employee employee = employeeService.getEmployeeById(id);

        if (employee != null) {
            return ResponseEntity.ok(employee);
        }

        return ResponseEntity.notFound().build();
    }

    // PUT - Update Employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable int id,
            @RequestBody Employee employee) {

        Employee updatedEmployee =
                employeeService.updateEmployee(id, employee);

        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE - Delete Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable int id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.ok("Employee deleted successfully");
    }
}
