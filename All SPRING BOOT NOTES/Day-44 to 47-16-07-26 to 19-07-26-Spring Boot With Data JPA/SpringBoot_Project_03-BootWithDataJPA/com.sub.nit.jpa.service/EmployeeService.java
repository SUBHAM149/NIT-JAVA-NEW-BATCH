package com.sub.nit.jpa.service;

import com.sub.nit.jpa.entity.Employee;

public interface EmployeeService {

    // Save Employee
    public Employee saveEmployee(Employee employee);

    // Get All Employees
    public Iterable<Employee> getAllEmployee();

    // Get Employee By Id
    public Employee getEmployeeById(int id);

    // Update Employee
    public Employee updateEmployee(int id, Employee employee);

    // Delete Employee
    public void deleteEmployee(int id);

}
