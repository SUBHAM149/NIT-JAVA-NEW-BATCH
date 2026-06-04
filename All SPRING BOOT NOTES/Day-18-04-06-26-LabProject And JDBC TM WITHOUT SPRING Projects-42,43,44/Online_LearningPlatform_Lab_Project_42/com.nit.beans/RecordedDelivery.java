package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("recordedDelivery")
public class RecordedDelivery implements DeliveryMode {

    @Override
    public String deliver(String courseName) {
        return "Recorded Video";
    }
}
