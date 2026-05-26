package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Person;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Person p = context.getBean(Person.class);

		p.display();
	}
}
OUTPUT
------
Parson Details
Person Name : Subham Behera
Person Age  : 21
Address     : Odisha
Mobile No   : 7896532468

Passport Details
Passport Name    : Subham
Passport Number  : IND768235
Country          : India
