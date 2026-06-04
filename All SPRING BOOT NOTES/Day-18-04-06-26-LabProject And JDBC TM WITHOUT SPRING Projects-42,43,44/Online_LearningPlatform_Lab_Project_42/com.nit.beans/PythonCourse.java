package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("pythonCourse")
public class PythonCourse implements Course{
	
	@Override
     public String getCourseName() {
    	 return "Python for Beginners";
     }
}
