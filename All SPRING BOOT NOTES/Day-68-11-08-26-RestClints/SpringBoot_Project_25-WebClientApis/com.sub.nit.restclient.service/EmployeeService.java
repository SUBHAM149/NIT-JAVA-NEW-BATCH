package com.sub.nit.restclient.service;

import java.util.List;

import com.sub.nit.restclient.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
