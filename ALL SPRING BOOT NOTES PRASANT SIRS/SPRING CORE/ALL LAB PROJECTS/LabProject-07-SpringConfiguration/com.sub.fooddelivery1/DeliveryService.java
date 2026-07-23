package com.sub.fooddelivery1;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    public void deliver() {
        System.out.println("Food Delivered Successfully");
    }
}
