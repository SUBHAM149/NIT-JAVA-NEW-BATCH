package com.example.dao;

import com.example.entity.Employee;

public interface EmployeeDAO {

    void insertEmployee(Employee employee);

    Employee getEmployeeById(int id);
}
