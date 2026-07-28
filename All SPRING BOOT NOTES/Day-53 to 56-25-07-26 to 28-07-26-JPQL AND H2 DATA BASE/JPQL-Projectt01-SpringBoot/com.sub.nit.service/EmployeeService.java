package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Employee;

public interface EmployeeService {
     public Employee saveEmployee(Employee emp);
     
     public List<Employee> getEmployeeByDepartment(String department);
     
     public List<Employee> getEmployeeBySalary(double salar);
}
