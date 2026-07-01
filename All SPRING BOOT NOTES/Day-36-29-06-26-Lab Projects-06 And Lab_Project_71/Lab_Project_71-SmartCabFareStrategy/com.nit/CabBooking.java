package com.nit;

public class CabBooking {

	private FareStrategy strategy;
	private String customerName;

	public void setStrategy(FareStrategy strategy) {
		this.strategy = strategy;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void bookCab() {

		System.out.println("Customer Name : " + customerName);

		strategy.showVehicleType();

	}

	public void generateBill(int distance) {

		double fare = strategy.calculateFare(distance);

		System.out.println("Total Fare : " + fare);

	}

}
