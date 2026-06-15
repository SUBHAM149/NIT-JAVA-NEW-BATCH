package com.nit.service;

public class TruckInsuranceClaim implements InsuranceClaim {

    @Override
    public void processClaim() {
        System.out.println("Truck insurance claim processed successfully.");
    }

}
