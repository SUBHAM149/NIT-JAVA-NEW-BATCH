package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.controller.BookController;
import com.nit.beans.Book;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BookController controller = context.getBean(BookController.class);

		controller.addBook(new Book(101, "Java Programming", "James Gosling"));
		controller.addBook(new Book(102, "Spring Framework", "Rod Johnson"));
		controller.addBook(new Book(103, "Hibernate Basics", "Gavin King"));

		controller.displayBooks();
	}
}
