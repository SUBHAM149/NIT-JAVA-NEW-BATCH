package com.nit;

public class VechicleFactory {

    public static Vechile getVechile(String type) {

        if(type.equalsIgnoreCase("Car")) {
            return new Car();
        }
        else if(type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}
