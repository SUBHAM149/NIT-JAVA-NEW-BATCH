package com.sub.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passportId;

    private String passportNumber;

    private String country;

    public Passport() {
    }

    public Passport(Integer passportId, String passportNumber, String country) {
        this.passportId = passportId;
        this.passportNumber = passportNumber;
        this.country = country;
    }

    public Integer getPassportId() {
        return passportId;
    }

    public void setPassportId(Integer passportId) {
        this.passportId = passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", country=" + country + "]";
    }
}
