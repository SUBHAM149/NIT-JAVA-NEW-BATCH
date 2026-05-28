package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Patient {
	@Value("501")
	private int patientId;
	@Value("Rahul")
	private String patientName;
	@Value("Fever")
	private String disease;
	
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease + "]";
	}
	
	
	
}
