package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Department
{
    @Value("Java Developer")
    private String deptName;

    @Value("Hyderabad")
    private String location;

    public void showDepartment()
    {
        System.out.println("Department Name  : " + deptName);

        System.out.println("Department Location : " + location);
    }
}
