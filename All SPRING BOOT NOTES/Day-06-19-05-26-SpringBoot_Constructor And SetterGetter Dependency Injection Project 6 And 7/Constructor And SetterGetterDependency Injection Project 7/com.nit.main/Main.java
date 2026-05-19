package com.nit.main;

import org.springframework.context.
ApplicationContext;

import org.springframework.context.support.
ClassPathXmlApplicationContext;

import com.nit.beans.Employee;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp =(Employee) context.getBean("emp");
        emp.display();
    }
}
OUTPUT
------
Employee ID : 5001
Employee Name : Subham
Employee Salary : 55000.0
Department : Department [d_id=101, d_name=IT, d_location=Hyderabad]
