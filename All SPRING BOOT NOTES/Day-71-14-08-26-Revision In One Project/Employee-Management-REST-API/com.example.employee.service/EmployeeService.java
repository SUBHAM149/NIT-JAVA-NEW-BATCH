package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.Employee;

public interface EmployeeService {

   public Employee saveEmployee(Employee employee);

   public List<Employee> getAllEmployees();

   public Employee getEmployeeById(Long id);

   public Employee getEmployeeByName(String name);

   public Employee getEmployeeByEmail(String email);

   public Employee updateEmployee(Long id, Employee employee);

   public void deleteEmployee(Long id);
}
