package com.sub.program07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("******** Student Enrollment ********");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program07/application-context.xml");

        StudentEnrollment student =
                context.getBean("student", StudentEnrollment.class);

        System.out.println(student);
    }

}
