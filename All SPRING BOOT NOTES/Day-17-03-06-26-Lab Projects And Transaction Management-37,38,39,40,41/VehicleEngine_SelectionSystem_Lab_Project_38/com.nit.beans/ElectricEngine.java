package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started.....⚡");
    }
}
