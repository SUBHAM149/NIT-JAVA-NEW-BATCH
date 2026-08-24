package com.sub.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int employeeId;

    private String employeeName;

    private double salary;

    private String designation;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName,
                    double salary, String designation) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId
                + ", employeeName=" + employeeName
                + ", salary=" + salary
                + ", designation=" + designation + "]";
    }
}
