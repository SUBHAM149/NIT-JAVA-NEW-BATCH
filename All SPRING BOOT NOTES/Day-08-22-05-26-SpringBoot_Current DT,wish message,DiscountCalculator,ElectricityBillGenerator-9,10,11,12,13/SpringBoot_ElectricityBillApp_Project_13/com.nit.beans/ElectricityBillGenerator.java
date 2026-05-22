package com.nit.beans;

public class ElectricityBillGenerator {

    private int unitsConsumed;
    private double ratePerUnit;

    // Setter Methods
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    // Business Method
    public double generateBill() {

        return unitsConsumed * ratePerUnit;

    }
}
