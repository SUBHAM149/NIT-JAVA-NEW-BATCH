package com.nit.beans;

public class Patient {
	private int patientId;
	private String patientName;
	private String disease;
	private Doctor doctor;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease + ", doctor="
				+ doctor + "]";
	}
}
