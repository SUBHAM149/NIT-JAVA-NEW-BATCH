package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("dataScienceCourse")
public class DataScienceCourse implements Course {
   
	@Override
	public String getCourseName() {
		return "Data Science With ML";
	}
}
