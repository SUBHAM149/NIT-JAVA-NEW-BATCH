package com.sub.doctorandpatient;

public class Patient {

    private int patientId;
    private String patientName;
    private String disease;

    private Doctor doctor;

    // Default Constructor
    public Patient() {
        System.out.println("Patient Object Created");
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void displayPatientDetails() {

        System.out.println("Patient Id      : " + patientId);
        System.out.println("Patient Name    : " + patientName);
        System.out.println("Disease         : " + disease);

        System.out.println("\nDoctor Details");
        System.out.println(doctor);
    }
}
