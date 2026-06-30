package com.nit;

public class MiniFare implements FareStrategy {

	private double baseFare;
	private double perKmCharge;

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public void setPerKmCharge(double perKmCharge) {
		this.perKmCharge = perKmCharge;
	}

	@Override
	public double calculateFare(int distance) {
		return baseFare + (distance * perKmCharge);
	}

	@Override
	public void showVehicleType() {
		System.out.println("Vehicle Type : Mini");
	}

}
