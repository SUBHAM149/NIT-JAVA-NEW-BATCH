package com.sub.hospital3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Appointment appointment = context.getBean(Appointment.class);
		appointment.bookAppointment();
	}
}
