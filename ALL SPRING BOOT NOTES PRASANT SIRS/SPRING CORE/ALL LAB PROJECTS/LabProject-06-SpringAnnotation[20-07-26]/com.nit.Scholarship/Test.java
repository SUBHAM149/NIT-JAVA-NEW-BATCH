package com.nit.Scholarship;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = context.getBean(Student.class);

		student.display();

		context.close();
	}

}
