package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Object obj = ctx.getBean("library");

		System.out.println(obj);
	}
}
OUTPUT
------
Library [libraryId=101, libraryName=Central Library, address=Hyderabad, librarian=Librarian [librarianId=1, librarianName=Rajesh, experience=10], books=[Java, Spring, Python], categories=[Programming, Database, Networking], categoryCount={Programming=50, Database=30, Networking=20}]
