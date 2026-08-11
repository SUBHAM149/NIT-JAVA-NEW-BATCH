package com.sub.nit.redis.service;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sub.nit.redis.entity.Employee;
import com.sub.nit.redis.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // CREATE
    @Override
    @CacheEvict(value = "employees", allEntries = true)
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    // GET ALL
    @Override
    @CachePut(value = "employees")
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    // GET BY ID
    @Override
    @CachePut(value = "employee", key = "#id")
    public Employee getEmployeeById(Integer id) {

        return employeeRepository.findById(id).orElse(null);
    }

    // UPDATE
    @Override
    @CachePut(value = "employee", key = "#id")
    @CacheEvict(value = "employees", allEntries = true)
    public Employee updateEmployee(Integer id, Employee employee) {

        Employee existingEmployee =
                employeeRepository.findById(id).orElse(null);

        if (existingEmployee == null) {
            return null;
        }

        existingEmployee.setName(employee.getName());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setEmail(employee.getEmail());

        return employeeRepository.save(existingEmployee);
    }

    // DELETE
    @Override
    @CacheEvict(value = {"employee", "employees"}, allEntries = true)
    public void deleteEmployee(Integer id) {

        employeeRepository.deleteById(id);
    }
}
