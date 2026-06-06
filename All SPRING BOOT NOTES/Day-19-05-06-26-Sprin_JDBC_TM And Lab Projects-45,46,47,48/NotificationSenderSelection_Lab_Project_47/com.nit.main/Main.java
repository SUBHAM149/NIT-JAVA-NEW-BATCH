package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.NotificationManager;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		NotificationManager nm = context.getBean(NotificationManager.class);

		nm.notifyUser("Welcome to Spring Core");

		System.out.println("Application Executed Successfully");
	}
}
