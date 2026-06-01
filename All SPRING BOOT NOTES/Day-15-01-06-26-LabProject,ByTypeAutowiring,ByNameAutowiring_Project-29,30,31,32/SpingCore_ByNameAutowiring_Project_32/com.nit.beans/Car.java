package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
       @Autowired
       @Qualifier("petrolEngine")
       private Engine engine;
       
       public void drive() {
    	   engine.start();
    	   System.out.println("We Are driving car.");
       }
}    
