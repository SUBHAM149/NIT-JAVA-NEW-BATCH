 package com.sub.program01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sub.program01.Book;
import com.sub.program02.Employee;

public class AppTest {

	public static void main(String[] args) {

		System.out.println("******** Program 1 ********");

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/sub/program01/application-context1.xml");

		Book book = context1.getBean("bookData", Book.class);

		System.out.println(book);

		
	}
}
