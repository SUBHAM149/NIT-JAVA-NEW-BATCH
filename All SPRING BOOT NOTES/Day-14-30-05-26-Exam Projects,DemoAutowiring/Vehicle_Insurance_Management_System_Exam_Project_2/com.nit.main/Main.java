package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Vehicle;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Vehicle vehicle = (Vehicle) ctx.getBean("vehicle");

		System.out.println(vehicle);
	}
}
OUTPUT
-------
Vehicle [vehicleNumber=AP39AB1234, vehicleName=Honda City, ownerName=Subham, insurance=Insurance [policyId=P101, companyName=LIC, premiumAmount=25000.0]]
