package com.nit.Scholarship;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${Student_name}")
    private String studentName;

    @Value("${Student_id}")
    private String studentId;

    @Value("${Student_percentage}")
    private double percentage;

    @Value("${Student_fee}")
    private long fee;

    @Value("${Student_isEligible}")
    private boolean eligible;

    
    public long calculateScholarship() {

        if (percentage >= 75 && eligible) {
            return 25000;
        }

        return 0;
    }

   
    public long calculateRemainingFee() {

        return fee - calculateScholarship();
    }

    public void display() {

        System.out.println("Student Name        : " + studentName);
        System.out.println("Student ID          : " + studentId);
        System.out.println("Percentage          : " + percentage);
        System.out.println("Original Fee        : " + fee);
        System.out.println("Eligible            : " + eligible);
        System.out.println("Scholarship Amount  : " + calculateScholarship());
        System.out.println("Remaining Fee       : " + calculateRemainingFee());

    }

}
