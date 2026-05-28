package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Doctor;
import com.nit.beans.Patient;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
       Doctor doctor = context.getBean(Doctor.class);
       Patient patient= context.getBean(Patient.class);
       
       System.out.println(doctor);
       System.out.println(patient);
		
	
	}

}
