package com.nit.service;

public class CarInsuranceClaim implements InsuranceClaim {

    @Override
    public void processClaim() {
        System.out.println("Car insurance claim processed successfully.");
    }

}
