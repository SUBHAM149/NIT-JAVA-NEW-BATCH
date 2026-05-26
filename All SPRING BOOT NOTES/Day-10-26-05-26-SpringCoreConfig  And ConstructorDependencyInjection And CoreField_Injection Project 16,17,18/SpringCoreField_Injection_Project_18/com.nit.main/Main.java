package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext  context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s=context.getBean(Student.class);
		s.display();
	}

}
OUTPUT
------
Id is: 101
Name is: Aryan
Branch is: DS
Branch is: 523689
