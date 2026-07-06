package com.sub.day11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("******** Spring Collection Injection ********");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/day11/application-context.xml");

		// Student Bean
		Student student = context.getBean("student", Student.class);
		System.out.println("Student List : " + student);

		// Course Bean
		Course course = context.getBean("course", Course.class);
		System.out.println("Course Set : " + course);

		// Duration Bean
		Duration duration = context.getBean("duration", Duration.class);
		System.out.println("Duration Map : " + duration);

		// CourseDetail Bean
		CourseDetail courseDetail = context.getBean("courseDetail", CourseDetail.class);
		System.out.println("Course Detail : " + courseDetail);

		// CompanyResource Bean
		CompanyResource companyResource = context.getBean("sources", CompanyResource.class);
		System.out.println("Database Properties : " + companyResource);
	}
}
