package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.aspect.StudentService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		service.saveStudent();

		System.out.println("----------------");

		service.updateStudent();

		
	}
}
