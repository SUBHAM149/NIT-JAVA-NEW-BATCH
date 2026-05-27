package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Hospital;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext  context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hospital h=context.getBean(Hospital.class);
		h.display();
	}

}
OUTPUT
------
Hospital Name is: Subham
Hospital Adress is: Odisha
Patient Id is: 101
Patient Name is: Mona
Patient Age is: 30
