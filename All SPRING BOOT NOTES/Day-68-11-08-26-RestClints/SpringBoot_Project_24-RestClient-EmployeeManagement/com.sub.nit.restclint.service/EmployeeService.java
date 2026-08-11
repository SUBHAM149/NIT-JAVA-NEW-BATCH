package com.sub.nit.restclint.service;

import java.util.List;

import com.sub.nit.restclint.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
