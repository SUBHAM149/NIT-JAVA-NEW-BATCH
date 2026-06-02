package com.nit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.beans.Employee;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
