package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
