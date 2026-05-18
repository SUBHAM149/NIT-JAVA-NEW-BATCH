package com.nit.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.
ClassPathXmlApplicationContext;

import com.nit.beans.Customer;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
        new ClassPathXmlApplicationContext(
        "applicationContext.xml");

        Customer c =
        (Customer) context.getBean("c_Id");

        c.display();
    }
}
OUTPUT
------
Customer ID : 101
Customer Name : Subham
Customer Item : Laptop
Customer Bill : 55000.0
