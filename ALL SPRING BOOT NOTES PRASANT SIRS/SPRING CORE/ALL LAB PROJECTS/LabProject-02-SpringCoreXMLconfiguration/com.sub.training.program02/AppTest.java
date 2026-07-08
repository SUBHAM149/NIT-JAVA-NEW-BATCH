package com.sub.training.program02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/training/program02/applicationContext.xml");

        TrainingInstitute institute =
                context.getBean("trainingInstitute", TrainingInstitute.class);

        institute.displayDetails();
    }
}
