package com.sub.hospital3;
import org.springframework.stereotype.Component;

@Component
public class Appointment {

    private DoctorService doctorService;

    public Appointment(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    public void bookAppointment() {
        System.out.println("Appointment Booked Successfully");
        doctorService.consult();
    }
}
