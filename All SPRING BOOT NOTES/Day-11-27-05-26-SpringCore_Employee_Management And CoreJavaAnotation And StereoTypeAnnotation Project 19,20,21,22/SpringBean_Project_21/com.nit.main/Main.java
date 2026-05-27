package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Employee;
import com.nit.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee e1 = context.getBean(Employee.class);
        Employee e2 = context.getBean(Employee.class);

        e1.display();
        e2.display();

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1 == e2);
    }
}
OUTPUT
------
Name is: Sasmita
Name is: Sasmita
com.nit.beans.Employee@2667f029
com.nit.beans.Employee@67a20f67
false
