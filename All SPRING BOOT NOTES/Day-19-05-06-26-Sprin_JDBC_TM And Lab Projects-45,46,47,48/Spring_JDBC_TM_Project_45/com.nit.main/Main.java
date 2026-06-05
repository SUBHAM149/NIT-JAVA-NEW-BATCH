package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.StudentService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		service.registerStudent();
		System.out.println("Student Registration Successful...");
		context.close();
	}
}
