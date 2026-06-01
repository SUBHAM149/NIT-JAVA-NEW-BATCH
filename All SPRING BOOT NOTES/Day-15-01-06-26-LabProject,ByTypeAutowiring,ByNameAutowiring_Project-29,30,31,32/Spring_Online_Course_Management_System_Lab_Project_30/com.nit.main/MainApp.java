package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.controller.CourseController;
import com.nit.model.Course;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CourseController controller = context.getBean(CourseController.class);

		Course c1 = context.getBean("course1", Course.class);
		Course c2 = context.getBean("course2", Course.class);
		Course c3 = context.getBean("course3", Course.class);

		controller.addNewCourse(c1);
		controller.addNewCourse(c2);
		controller.addNewCourse(c3);

		controller.showAllCourses();

		controller.searchCourse(102);

		context.close();
	}
}
OUTPUT
------
Course Added Successfully
Course Added Successfully
Course Added Successfully

===== ALL COURSES =====
Course [courseId=101, courseName=Java Full Stack, trainerName=Naresh, courseFee=25000.0]
Course [courseId=102, courseName=Spring Boot, trainerName=Mahesh, courseFee=18000.0]
Course [courseId=103, courseName=Microservices, trainerName=Suresh, courseFee=22000.0]

Course Found
Course [courseId=102, courseName=Spring Boot, trainerName=Mahesh, courseFee=18000.0]
