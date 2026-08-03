package com.sub.nit.employee.service;


import java.util.List;

import com.sub.nit.employee.entity.Employee;

public interface EmployeeService {

    // Save Employee
    Employee saveEmployee(Employee employee);

    // Get All Employees
    List<Employee> getAllEmployees();

    // Get Employee By Id
    Employee getEmployeeById(Integer id);

    // Update Employee
    Employee updateEmployee(Employee employee);

    // Delete Employee
    void deleteEmployee(Integer id);
}
