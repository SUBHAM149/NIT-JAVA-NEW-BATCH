package com.nit.beans;

public class Patient {

	private int patientId;
	private String patientName;
	private String disease;
	private String admissionDate;

	public Patient(int patientId, String patientName, String disease, String admissionDate) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.admissionDate = admissionDate;
	}

	public int getPatientId() {
		return patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getDisease() {
		return disease;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}
}
