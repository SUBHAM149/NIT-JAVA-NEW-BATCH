package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.controller.LearningController;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LearningController controller = context.getBean(LearningController.class);

		controller.enrollJavaCourse();
		controller.enrollPythonCourse();
		controller.enrollDataScienceCourse();
	}
}
