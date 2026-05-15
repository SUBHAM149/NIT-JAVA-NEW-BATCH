package com.nit.beans;

public class Student {

    private int sid;
    private String sname;
    private double fees;
    private String course;

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {

        System.out.println("Student ID is : " + sid);
        System.out.println("Student Name is : " + sname);
        System.out.println("Student Fees is : " + fees);
        System.out.println("Student Course is : " + course);
    }
}
