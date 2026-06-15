package com.nit.service;

public class SwiggyDelivery implements FoodDeliveryService {

    @Override
    public void deliverFood() {
        System.out.println("Food delivered using Swiggy.");
    }
}
