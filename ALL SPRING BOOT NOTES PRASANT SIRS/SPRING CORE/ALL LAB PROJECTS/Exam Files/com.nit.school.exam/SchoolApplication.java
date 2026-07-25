package com.nit.school.exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("\nSpring Container Started\n");

		ResultService result = context.getBean(ResultService.class);

		result.generateResult();

		context.close();
	}

}
