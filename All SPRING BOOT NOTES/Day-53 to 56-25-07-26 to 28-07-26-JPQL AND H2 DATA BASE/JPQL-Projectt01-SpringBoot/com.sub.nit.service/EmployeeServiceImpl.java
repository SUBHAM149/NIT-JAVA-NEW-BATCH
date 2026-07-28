package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Employee;
import com.sub.nit.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        return repo.findByDepartment(department);
    }

    @Override
    public List<Employee> getEmployeeBySalary(double salary) {
        return repo.findGreaterSalary(salary);
    }

}
