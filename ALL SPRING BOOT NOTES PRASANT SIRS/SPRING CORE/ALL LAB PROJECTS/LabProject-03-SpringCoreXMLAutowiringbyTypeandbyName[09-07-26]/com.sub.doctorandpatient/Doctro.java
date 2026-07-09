package com.sub.doctorandpatient;

public class Doctor {

    private String doctorId;
    private String doctorName;
    private String specialization;

    // Default Constructor
    public Doctor() {
        System.out.println("Doctor Object Created");
    }

    // Parameterized Constructor
    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "\nDoctor Id        : " + doctorId +
               "\nDoctor Name      : " + doctorName +
               "\nSpecialization   : " + specialization;
    }
}
