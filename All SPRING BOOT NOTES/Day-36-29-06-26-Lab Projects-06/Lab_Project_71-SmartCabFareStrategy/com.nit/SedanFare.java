package com.nit;

public class SedanFare implements FareStrategy {

	private double luxuryCharge;
	private double perKmCharge;

	public void setLuxuryCharge(double luxuryCharge) {
		this.luxuryCharge = luxuryCharge;
	}

	public void setPerKmCharge(double perKmCharge) {
		this.perKmCharge = perKmCharge;
	}

	@Override
	public double calculateFare(int distance) {
		return luxuryCharge + (distance * perKmCharge);
	}

	@Override
	public void showVehicleType() {
		System.out.println("Vehicle Type : Sedan");
	}

}
