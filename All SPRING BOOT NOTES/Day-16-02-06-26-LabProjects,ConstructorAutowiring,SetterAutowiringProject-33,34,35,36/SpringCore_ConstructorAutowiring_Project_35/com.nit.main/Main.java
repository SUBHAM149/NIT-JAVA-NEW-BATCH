package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Car;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = ctx.getBean(Car.class);

		car.drive();
	}
}
OUTPUT
-------
Engine Started..
We are driving..
