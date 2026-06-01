package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Car;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Car c=context.getBean(Car.class);
		c.drive();

	}

}
OUTPUT
------
Engine has been Started using Petrol Engine..
We Are driving car.
