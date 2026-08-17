package com.sub.nit.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.patient.client.DoctorClient;
import com.sub.nit.patient.entity.Doctor;
import com.sub.nit.patient.entity.Patient;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private DoctorClient doctorClient;

    public PatientController(DoctorClient doctorClient) {
        this.doctorClient = doctorClient;
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable int id) {

        Patient patient;

        if (id == 1) {
            patient = new Patient(1, "Amit", 101);
        } 
        else if (id == 2) {
            patient = new Patient(2, "Rahul", 102);
        } 
        else if (id == 3) {
            patient = new Patient(3, "Priya", 103);
        } 
        else {
            patient = new Patient(id, "Unknown Patient", 101);
        }

        Doctor doctor = doctorClient.getDoctor(patient.getDoctorId());

        patient.setDoctor(doctor);

        return patient;
    }
}
