package com.nit.SpringBoot_Project_02_EmployeE_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.SpringBoot_Project_02_EmployeE_MVC.entity.Employee;
import com.nit.SpringBoot_Project_02_EmployeE_MVC.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> emp = repo.findAll();
        return emp;
    }

    @Override
    public Employee getEmployeeById(long id) {
        Employee emp = repo.findById(id).orElse(null);
        return emp;
    }

    @Override
    public void saveEmployee(Employee emp) {
        repo.save(emp);
    }

    @Override
    public Employee updateEmployee(long id, Employee emp) {

        Employee employee = repo.findById(id).orElse(null);

        if (employee != null) {

            employee.setName(emp.getName());
            employee.setDepartment(emp.getDepartment());
            employee.setEmail(emp.getEmail());
            employee.setMob_num(emp.getMob_num());

            employee = repo.save(employee);
        }

        return emp;
    }

    @Override
    public void deleteEmployee(long id) {
        repo.deleteById(id);
    }
}
