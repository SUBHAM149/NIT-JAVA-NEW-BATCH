package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Institute;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
        new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Institute institute =
        (Institute) context.getBean("institute");

       // System.out.println(institute);
        
        institute.display();
    }
}
OUTPUT
------
Institute Id : 1
Institute Name : Naresh IT
============================
Student Id : 101
Student Name : Subham
Student Course : Java Full Stack
Student Fees : 50000.0
-------------------------
Student Id : 102
Student Name : Rahul
Student Course : Python Full Stack
Student Fees : 45000.0
-------------------------
Student Id : 103
Student Name : Priya
Student Course : Data Science
Student Fees : 60000.0
-------------------------  
