package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.beans.Employee;
import com.nit.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    public void addEmployee(Employee emp) {
        service.registerEmployee(emp);
    }

    public void showEmployees() {
        List<Employee> employees = service.displayEmployees();

        System.out.println("------ Employee Details ------");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
