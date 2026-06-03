package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private Employee employee;

    @Transactional
    public void registerEmployee() {

        employee.saveEmployee();

        System.out.println("Transaction Successful");
    }
}
