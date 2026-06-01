package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
	@Autowired
	private Engine engine;
	
	public void drive() {
		
		engine.start();
		System.out.println("We Are Drive.. the car...");
	}
}
