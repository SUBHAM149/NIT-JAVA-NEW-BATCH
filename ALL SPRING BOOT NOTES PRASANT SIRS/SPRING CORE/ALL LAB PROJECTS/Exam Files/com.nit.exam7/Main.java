package com.nit.exam7;

public class Main {

	public static void main(String[] args) {

		Flight flight = new Flight(101, "IndiGo 6E-501", "Hyderabad", "Delhi", "10:30 AM", 5500.00);

		flight.display();

		System.out.println();

		Class<?> cls = flight.getClass();

		FlightInfo info = cls.getAnnotation(FlightInfo.class);

		System.out.println("======= Flight Annotation Details =======");
		System.out.println("Airline        : " + info.airline());
		System.out.println("Flight Type    : " + info.flightType());
		System.out.println("Terminal       : " + info.terminal());
		System.out.println("Baggage Limit  : " + info.baggageLimit() + " Kg");
	}
}
