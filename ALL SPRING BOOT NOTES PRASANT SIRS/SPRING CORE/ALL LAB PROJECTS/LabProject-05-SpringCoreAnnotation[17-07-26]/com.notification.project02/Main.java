package com.notification.project02;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/notification/project02/applicationContext.xml");

        NotificationService service =
                context.getBean(NotificationService.class);

        service.sendNotification();
    }
}
