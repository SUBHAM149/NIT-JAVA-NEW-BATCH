package com.sub.nit.service;

import com.sub.nit.dao.EmployeeDao;
import com.sub.nit.entity.Employee;

public class EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    // Save Employee
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    // Get Employee by ID
    public Employee getEmployeeById(int employeeId) {
        return employeeDao.getEmployeeById(employeeId);
    }
}
