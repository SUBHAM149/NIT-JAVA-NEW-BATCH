package com.sub.nit.redis.service;

import java.util.List;

import com.sub.nit.redis.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee updateEmployee(Integer id, Employee employee);

    void deleteEmployee(Integer id);
}
