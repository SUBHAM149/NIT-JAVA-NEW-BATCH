package com.nit.beans;

public class Vehicle {
	private String vehicleNumber;
	private String vehicleName;
	private String ownerName;
	private Insurance insurance;

	public Vehicle(String vehicleNumber, String vehicleName, String ownerName, Insurance insurance) {
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.ownerName = ownerName;
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + ", ownerName=" + ownerName
				+ ", insurance=" + insurance + "]";
	}
}
