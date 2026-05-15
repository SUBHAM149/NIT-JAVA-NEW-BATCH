package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Student;

public class Main {

    public static void main(String[] args) {

        String config_file ="/com/nit/resources/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);

        Student std =
        (Student) context.getBean("std");

        std.display();
    }
}

OUTPUT
------
Student ID is : 101
Student Name is : Subham
Student Fees is : 25000.0
Student Course is : Full Stack Java
