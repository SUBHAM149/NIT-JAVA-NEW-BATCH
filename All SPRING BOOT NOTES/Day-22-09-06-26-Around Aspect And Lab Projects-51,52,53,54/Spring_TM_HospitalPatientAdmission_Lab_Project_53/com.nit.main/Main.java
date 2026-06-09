package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.BedAllocation;
import com.nit.beans.HospitalService;
import com.nit.beans.Patient;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		HospitalService service = context.getBean(HospitalService.class);

		Patient patient = new Patient(101, "Suresh", "FEVER", "2025-06-09");

		BedAllocation bed = new BedAllocation(1, 101, "GENERAL", 12);

		service.admitPatient(patient, bed);

		context.close();
	}
}
