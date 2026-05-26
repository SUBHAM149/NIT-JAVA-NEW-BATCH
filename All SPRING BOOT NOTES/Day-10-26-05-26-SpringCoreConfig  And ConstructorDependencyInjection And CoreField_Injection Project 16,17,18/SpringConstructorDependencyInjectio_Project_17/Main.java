package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Person;
import com.nit.config.AppConfig;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println(p);
    }
}
OUTPUT
-------
Person [name=Subham, age=21, mob_num=4258963257, pass=Passport [p_name=Subham, p_num=IND56, country=INDIA]]
