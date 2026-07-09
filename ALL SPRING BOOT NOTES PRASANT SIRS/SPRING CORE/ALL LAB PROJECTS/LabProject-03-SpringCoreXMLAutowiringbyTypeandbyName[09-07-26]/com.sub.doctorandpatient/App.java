package com.sub.doctorandpatient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/doctorandpatient/application-context.xml");

		Patient patient = context.getBean("patient", Patient.class);

		patient.displayPatientDetails();
	}
}
