package com.nit.autowiring;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Email Notification Sent Successfully");
    }
}
