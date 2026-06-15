package com.nit.service;

public class UberEatsDelivery implements FoodDeliveryService {

    @Override
    public void deliverFood() {
        System.out.println("Food delivered using Uber Eats.");
    }
}
