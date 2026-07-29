package com.sub.nit.transactional.service;

import java.util.List;

import com.sub.nit.transactional.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    String transferSalary(Integer senderId,
                          Integer receiverId,
                          Double amount);

}
