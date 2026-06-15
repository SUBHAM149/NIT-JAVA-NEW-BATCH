package com.nit.service;

public class ZomatoDelivery implements FoodDeliveryService {

    @Override
    public void deliverFood() {
        System.out.println("Food delivered using Zomato.");
    }
}
