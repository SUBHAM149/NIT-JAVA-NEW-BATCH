package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
