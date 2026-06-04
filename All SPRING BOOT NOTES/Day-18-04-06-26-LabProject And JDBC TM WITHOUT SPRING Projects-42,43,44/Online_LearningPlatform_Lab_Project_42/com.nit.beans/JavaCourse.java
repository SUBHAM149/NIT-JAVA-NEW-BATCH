package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("javaCourse")
public class JavaCourse implements Course {

    @Override
    public String getCourseName() {
        return "Java Programming";
    }
}
