package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {

    @Value("101")
    private int sid;

    @Value("SUBHAM")
    private String sname;

    @Value("JAVA")
    private String course;

    @Autowired
    private Adress adress;

   

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid +
                ", sname=" + sname +
                ", course=" + course +
                ", adress=" + adress + "]";
    }
}
