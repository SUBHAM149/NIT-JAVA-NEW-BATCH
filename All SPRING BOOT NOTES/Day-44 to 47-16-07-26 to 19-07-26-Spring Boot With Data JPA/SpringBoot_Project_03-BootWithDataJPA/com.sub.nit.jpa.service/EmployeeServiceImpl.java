package com.sub.nit.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.jpa.entity.Employee;
import com.sub.nit.jpa.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Iterable<Employee> getAllEmployee() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(int id, Employee emp) {

        Employee employee = repository.findById(id).orElse(null);

        if (employee != null) {

            employee.setName(emp.getName());
            employee.setDept(emp.getDept());
            employee.setMob_num(emp.getMob_num());

            return repository.save(employee);
        }

        return null;
    }

    @Override
    public void deleteEmployee(int id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
