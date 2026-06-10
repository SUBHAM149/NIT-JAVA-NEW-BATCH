package com.nit.aspect;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void saveStudent() {
        System.out.println("Student Saved Successfully");
    }

    public void updateStudent() {
        System.out.println("Student Updated Successfully");
    }

    public void deleteStudent() {
        System.out.println("Student Deleted Successfully");
    }

    public void getStudent() {
        System.out.println("Student Details Retrieved");
    }
}
