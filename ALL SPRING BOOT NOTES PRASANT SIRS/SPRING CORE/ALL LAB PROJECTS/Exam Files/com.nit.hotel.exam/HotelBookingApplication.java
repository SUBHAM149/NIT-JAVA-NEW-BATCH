package com.nit.hotel.exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelBookingApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		HotelBooking booking = context.getBean(HotelBooking.class);

		booking.generateBill();

		context.close();
	}
}
