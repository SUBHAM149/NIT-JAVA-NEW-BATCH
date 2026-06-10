package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.beans.StudentService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		Student student = service.getStudent();

		System.out.println("Main Method Received : " + student);

	}
}
