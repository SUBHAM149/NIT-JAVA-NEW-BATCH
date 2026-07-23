package com.sub.fooddelivery1;

import org.springframework.stereotype.Component;

@Component
public class FoodOrder {

    private DeliveryService deliveryService;

    public FoodOrder(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void placeOrder() {
        System.out.println("Food Order Confirmed");
        deliveryService.deliver();
    }
}
