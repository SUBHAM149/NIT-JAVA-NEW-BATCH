package com.sub.program10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("******** Email Configuration ********");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program10/application-context.xml");

        EmailConfig config =
                context.getBean("emailConfig", EmailConfig.class);

        System.out.println(config);
    }

}
