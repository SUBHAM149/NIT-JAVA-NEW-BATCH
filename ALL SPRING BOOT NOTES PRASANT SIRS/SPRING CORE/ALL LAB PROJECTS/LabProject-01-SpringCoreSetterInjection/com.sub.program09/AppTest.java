package com.sub.program09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("******** Library ********");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program09/application-context.xml");

        Library library =
                context.getBean("library", Library.class);

        System.out.println(library);
    }

}
