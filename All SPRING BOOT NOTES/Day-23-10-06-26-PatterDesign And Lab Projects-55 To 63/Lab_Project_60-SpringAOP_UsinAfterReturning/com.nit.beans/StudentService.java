package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public Student getStudent() {

        System.out.println("Fetching Student Details...");

        return new Student(101, "Suresh");
    }
}
