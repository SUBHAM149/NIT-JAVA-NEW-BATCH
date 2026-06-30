package com.nit;

public class SUVFare implements FareStrategy {

	private double nightCharge;
	private double perKmCharge;

	public void setNightCharge(double nightCharge) {
		this.nightCharge = nightCharge;
	}

	public void setPerKmCharge(double perKmCharge) {
		this.perKmCharge = perKmCharge;
	}

	@Override
	public double calculateFare(int distance) {
		return nightCharge + (distance * perKmCharge);
	}

	@Override
	public void showVehicleType() {
		System.out.println("Vehicle Type : SUV");
	}

}
