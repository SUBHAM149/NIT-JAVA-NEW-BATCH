package com.sub.nit.doctor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.doctor.entity.Doctor;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable int id) {

        if (id == 101) {
            return new Doctor(101, "Subham", "Ortho");
        }

        if (id == 102) {
            return new Doctor(102, "Rahul", "Cardiologist");
        }

        if (id == 103) {
            return new Doctor(103, "Priya", "Neurologist");
        }

        return new Doctor(id, "Unknown", "General");
    }
}
