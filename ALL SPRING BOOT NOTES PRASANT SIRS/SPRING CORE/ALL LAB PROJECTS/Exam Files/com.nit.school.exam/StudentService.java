package com.nit.school.exam;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("teacherService")
public class StudentService {

    public StudentService() {
        System.out.println("StudentService Bean Created");
    }

    public void study() {
        System.out.println("Student is Studying...");
    }

}
