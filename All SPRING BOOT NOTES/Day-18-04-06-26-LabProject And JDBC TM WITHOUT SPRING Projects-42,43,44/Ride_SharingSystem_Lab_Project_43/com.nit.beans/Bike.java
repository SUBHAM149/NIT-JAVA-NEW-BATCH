package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {

    @Override
    public String ride() {
        return "Bike ride started";
    }
}
