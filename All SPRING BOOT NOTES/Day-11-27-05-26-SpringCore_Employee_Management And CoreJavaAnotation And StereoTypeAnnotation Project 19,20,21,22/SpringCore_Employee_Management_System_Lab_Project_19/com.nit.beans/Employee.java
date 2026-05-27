package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee
{
    @Value("101")
    private int empId;

    @Value("Subham Behera")
    private String empName;

    @Value("50000")
    private double salary;

    public void work()
    {
        System.out.println("Employee Is Working");
    }

    public void showEmployee()
    {
        System.out.println("Employee ID      : " + empId);

        System.out.println("Employee Name    : " + empName);

        System.out.println("Employee Salary  : " + salary);
    }
}
