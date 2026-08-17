package com.sub.nit.patient.entity;

public class Patient {

    private int id;
    private String name;
    private int doctorId;
    private Doctor doctor;

    public Patient() {
    }

    public Patient(int id, String name, int doctorId) {
        this.id = id;
        this.name = name;
        this.doctorId = doctorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
