package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student st = context.getBean("st", Student.class);

		System.out.println(st);
	}
}
OUTPUT
------
Student [sid=101, sname=SUBHAM, course=JAVA, adress=Adress [city=Balasore, state=Odisha]]
