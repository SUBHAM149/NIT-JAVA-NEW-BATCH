package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.beans.Book;
import com.nit.repository.BookRepository;

@Component
public class BookService {
     
	@Autowired
	private BookRepository repository;
	
	
	public void addBook(Book book) {
		repository.addBook(book);
	}
	
	public void displayBooks() {
		System.out.println("---Available Book---");
		
		for(Book book:repository.viewBooks()) {
			System.out.println(book);
		}
	}
	
}
