package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Employee;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp = (Employee) context.getBean("emp");

        emp.display();
    }
}
OUTPUT
------
Employee Id   : 1
Employee Name : Rahul
Salary        : 45000.0
Department    : IT
