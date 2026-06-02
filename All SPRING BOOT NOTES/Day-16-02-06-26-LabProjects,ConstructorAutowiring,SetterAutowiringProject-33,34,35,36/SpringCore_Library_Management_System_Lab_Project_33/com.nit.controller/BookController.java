package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.beans.Book;
import com.nit.service.BookService;

@Controller
public class BookController {
    
	@Autowired
	private BookService service;
	
	public void addBook(Book book) {
		service.addBook(book);
	}
	
	public void displayBooks() {
		service.displayBooks();
	}
}
