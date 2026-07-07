package com.sub.program05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program05/applicationContext.xml");

        Project project = context.getBean("project", Project.class);

        project.display();

    }
}
