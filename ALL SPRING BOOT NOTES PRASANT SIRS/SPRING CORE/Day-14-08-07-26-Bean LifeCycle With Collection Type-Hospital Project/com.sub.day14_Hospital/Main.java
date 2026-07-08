package com.sub.day14_Hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/day14_Hospital/application-context.xml");
		HospitalService bean = context.getBean("hospitalService", HospitalService.class);
		System.out.println(bean.getCodeAndName());
		Hospital bean2 = context.getBean("hospital1", Hospital.class);
		int code = bean2.getHospitalCode();
		Hospital detail = bean.getDetail(code);
		if (detail != null) {
			System.out.println(detail);
		} else {
			System.out.println("No matching found!");
		}
	}
}
