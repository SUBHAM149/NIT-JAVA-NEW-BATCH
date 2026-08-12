package com.sub.nit.integration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sub.nit.integration.entity.Patient;
import com.sub.nit.integration.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int id) {
        return patientRepository.findById(id).orElse(null);
    }
}
