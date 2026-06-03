package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel engine started.....🚛");
    }
}
