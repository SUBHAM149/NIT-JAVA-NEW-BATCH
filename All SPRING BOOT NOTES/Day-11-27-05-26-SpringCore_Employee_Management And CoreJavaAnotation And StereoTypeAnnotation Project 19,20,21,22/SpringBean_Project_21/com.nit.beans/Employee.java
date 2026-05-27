package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
// @Scope("singleton")
public class Employee {

    @Value("Sasmita")
    String e_name;

    public void display()
    {
        System.out.println("Name is: " + e_name);
    }
}
