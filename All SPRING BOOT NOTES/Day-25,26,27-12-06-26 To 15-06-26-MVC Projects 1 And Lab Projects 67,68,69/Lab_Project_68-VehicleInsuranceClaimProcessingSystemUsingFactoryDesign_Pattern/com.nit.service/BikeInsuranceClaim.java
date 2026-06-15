package com.nit.service;

public class BikeInsuranceClaim implements InsuranceClaim {

    @Override
    public void processClaim() {
        System.out.println("Bike insurance claim processed successfully.");
    }

}
