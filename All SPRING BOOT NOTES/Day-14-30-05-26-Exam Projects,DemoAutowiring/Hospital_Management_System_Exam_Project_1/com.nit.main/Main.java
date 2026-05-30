package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Patient;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Patient patient = (Patient) ctx.getBean("patient");

		System.out.println(patient);
	}
}
OUTPUT
------
Patient [patientId=501, patientName=Rahul, disease=Fever, doctor=Doctor [doctorId=101, doctorName=Dr.Rajesh, specialization=Cardiologist]]
