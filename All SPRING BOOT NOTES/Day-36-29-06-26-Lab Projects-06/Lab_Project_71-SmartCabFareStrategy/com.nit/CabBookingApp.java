package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CabBookingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean using Alias

		FareStrategy strategy = (FareStrategy) context.getBean("economyRide");

		CabBooking booking = new CabBooking();

		booking.setCustomerName("Subham");

		booking.setStrategy(strategy);

		booking.bookCab();

		booking.generateBill(50);

	}

}
