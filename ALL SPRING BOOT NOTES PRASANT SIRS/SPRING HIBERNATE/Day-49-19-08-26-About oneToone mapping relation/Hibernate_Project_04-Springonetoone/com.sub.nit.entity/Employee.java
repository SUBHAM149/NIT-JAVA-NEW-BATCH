package com.sub.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

    @Id
    private int employeeId;

    private String employeeName;

    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    private IdentityCard identityCard;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, double salary, IdentityCard identityCard) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.identityCard = identityCard;
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

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId
                + ", employeeName=" + employeeName
                + ", salary=" + salary
                + ", identityCard=" + identityCard + "]";
    }
}
