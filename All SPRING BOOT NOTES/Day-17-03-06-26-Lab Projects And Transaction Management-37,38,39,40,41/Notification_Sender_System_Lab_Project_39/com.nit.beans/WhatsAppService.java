package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("WhatsApp sent: " + message);
    }
}
