package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HospitalService {

	@Autowired
	private PatientDAO patientDAO;

	@Autowired
	private BedAllocationDAO bedDAO;

	@Transactional
	public void admitPatient(Patient patient, BedAllocation bed) {

		patientDAO.savePatient(patient);

		//int x = 10 / 0; // Exception Demo

		bedDAO.saveBed(bed);

		System.out.println("Patient Admitted Successfully");
	}
}
