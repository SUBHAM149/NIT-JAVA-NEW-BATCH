package com.sub.nit.hospital;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("hospitalStartup")
public class PatientService {

    public PatientService() {
        System.out.println("PatientService Bean Created");
    }

    public void registerPatient() {
        System.out.println("Patient Registered Successfully.");
    }

    public void searchPatient() {
        System.out.println("Patient Found Successfully.");
    }

    public void bookAppointment() {
        System.out.println("Appointment Booked Successfully.");
    }
}
