package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Doctor {
	@Value("101")
	private int doctorId;
	@Value("Dr.Rajesh")
	private String doctorName;
	@Value("Cardiologist")
	private String specialization;
	
	
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ "]";
	}
	
}
