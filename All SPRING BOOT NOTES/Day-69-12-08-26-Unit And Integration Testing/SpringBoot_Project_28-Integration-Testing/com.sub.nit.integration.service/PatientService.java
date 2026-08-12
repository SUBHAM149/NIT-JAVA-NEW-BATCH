package com.sub.nit.integration.service;

import java.util.List;

import com.sub.nit.integration.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getAllPatients();

	Patient getPatientById(int id);
}
