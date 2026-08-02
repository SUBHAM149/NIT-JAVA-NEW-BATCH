package com.sub.nit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Employee;
import com.sub.nit.repository.EmployeeRepository;
import com.sub.nit.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {

        Employee emp = repository.findById(id).orElse(null);

        if (emp != null) {
            emp.setEmployeeName(employee.getEmployeeName());
            emp.setDepartment(employee.getDepartment());
            emp.setSalary(employee.getSalary());

            return repository.save(emp);
        }

        return null;
    }

    @Override
    public String deleteEmployee(Integer id) {

        repository.deleteById(id);

        return "Employee Deleted Successfully";
    }

}
