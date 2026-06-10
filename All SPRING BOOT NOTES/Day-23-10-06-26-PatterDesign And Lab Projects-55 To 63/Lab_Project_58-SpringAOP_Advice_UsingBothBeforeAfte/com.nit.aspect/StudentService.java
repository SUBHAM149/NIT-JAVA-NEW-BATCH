package com.nit.aspect;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void saveStudent() {
        System.out.println("Student saved successfully...");
    }

    public void deleteStudent() {
        System.out.println("Student deleted successfully...");
    }
}
