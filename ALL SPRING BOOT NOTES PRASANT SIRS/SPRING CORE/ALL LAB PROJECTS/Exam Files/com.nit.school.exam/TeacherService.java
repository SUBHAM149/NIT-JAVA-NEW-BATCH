package com.nit.school.exam;

import org.springframework.stereotype.Component;

@Component
public class TeacherService {

    public TeacherService() {
        System.out.println("TeacherService Bean Created");
    }

    public void teach() {
        System.out.println("Teacher is Teaching...");
    }

}
