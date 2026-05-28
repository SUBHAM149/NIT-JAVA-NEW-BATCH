package com.nit.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp1=context.getBean(Employee.class);
		Employee emp2=context.getBean(Employee.class);
		
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}

}
OUTPUT
------
333683827
1691185247
