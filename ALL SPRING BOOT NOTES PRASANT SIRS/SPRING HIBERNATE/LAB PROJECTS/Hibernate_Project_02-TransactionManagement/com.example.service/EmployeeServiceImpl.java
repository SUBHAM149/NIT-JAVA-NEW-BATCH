package com.example.service;

import com.example.dao.EmployeeDAO;
import com.example.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void insertEmployee(Employee employee) {

        employeeDAO.insertEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {

        return employeeDAO.getEmployeeById(id);
    }
}
