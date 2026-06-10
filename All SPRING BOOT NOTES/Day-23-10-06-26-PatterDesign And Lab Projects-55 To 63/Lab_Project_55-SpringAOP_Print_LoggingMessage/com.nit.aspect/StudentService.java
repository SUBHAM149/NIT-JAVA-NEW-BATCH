package com.nit.aspect;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void saveStudent() {

        System.out.println("Student record saved successfully...");
    }
}
