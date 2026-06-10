package com.nit;

public class Test {

    public static void main(String[] args) {

        Vechile v1 = VechicleFactory.getVechile("Car");
        v1.ride();

        Vechile v2 = VechicleFactory.getVechile("Bike");
        v2.ride();
    }
}
