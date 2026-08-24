package com.sub.nit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    private int departmentId;

    private String departmentName;

    private String location;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;

    public Department() {
    }

    public Department(int departmentId, String departmentName,
                      String location, List<Employee> employees) {

        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
        this.employees = employees;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId
                + ", departmentName=" + departmentName
                + ", location=" + location + "]";
    }
}
