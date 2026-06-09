package com.nit.beans;

public class BedAllocation {

	private int allocationId;
	private int patientId;
	private String wardName;
	private int bedNumber;


	public BedAllocation(int allocationId, int patientId, String wardName, int bedNumber) {

		this.allocationId = allocationId;
		this.patientId = patientId;
		this.wardName = wardName;
		this.bedNumber = bedNumber;
	}

	public int getAllocationId() {
		return allocationId;
	}

	public int getPatientId() {
		return patientId;
	}

	public String getWardName() {
		return wardName;
	}

	public int getBedNumber() {
		return bedNumber;
	}
}
