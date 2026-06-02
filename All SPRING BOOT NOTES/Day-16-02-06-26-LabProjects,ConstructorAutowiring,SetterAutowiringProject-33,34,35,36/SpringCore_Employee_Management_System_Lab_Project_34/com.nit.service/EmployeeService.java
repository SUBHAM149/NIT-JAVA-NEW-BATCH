package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.beans.Employee;
import com.nit.repository.EmployeeRepository;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void registerEmployee(Employee emp) {
        repository.saveEmployee(emp);
    }

    public List<Employee> displayEmployees() {
        return repository.getEmployees();
    }
}
