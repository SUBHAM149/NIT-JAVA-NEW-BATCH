package com.nit.exam7;

@FlightInfo(airline = "IndiGo", flightType = "Domestic", terminal = "T1", baggageLimit = 25)
public class Flight {

	private int flightId;
	private String flightName;
	private String source;
	private String destination;
	private String departureTime;
	private double ticketPrice;

	public Flight(int flightId, String flightName, String source, String destination, String departureTime,
			double ticketPrice) {

		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.ticketPrice = ticketPrice;
	}

	public void display() {

		System.out.println("========== Flight Details ==========");
		System.out.println("Flight ID      : " + flightId);
		System.out.println("Flight Name    : " + flightName);
		System.out.println("Source         : " + source);
		System.out.println("Destination    : " + destination);
		System.out.println("Departure Time : " + departureTime);
		System.out.println("Ticket Price   : " + ticketPrice);
	}
}
