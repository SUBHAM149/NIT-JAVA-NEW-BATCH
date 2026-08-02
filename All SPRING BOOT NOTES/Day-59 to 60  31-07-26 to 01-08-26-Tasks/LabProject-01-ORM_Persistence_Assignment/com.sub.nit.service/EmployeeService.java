package com.sub.nit.service;

import java.util.List;
import com.sub.nit.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee updateEmployee(Integer id, Employee employee);

    String deleteEmployee(Integer id);

}
