package com.nit.beans;

public class Employee {

    private int e_id;
    private String e_name;
    private double e_salary;

    private Department department;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    
    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    
    public double getE_salary() {
        return e_salary;
    }

    public void setE_salary(double e_salary) {
        this.e_salary = e_salary;
    }

    
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(
    Department department) {

        this.department = department;
    }

    
    public void display() {

        System.out.println("Employee ID : " + e_id);
        System.out.println("Employee Name : " + e_name);
        System.out.println("Employee Salary : " + e_salary);
        System.out.println("Department : " + department);
    }
}
