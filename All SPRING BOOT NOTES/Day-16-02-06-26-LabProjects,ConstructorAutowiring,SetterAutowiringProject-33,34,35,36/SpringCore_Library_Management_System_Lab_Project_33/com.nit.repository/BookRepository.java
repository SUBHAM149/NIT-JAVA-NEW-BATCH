package com.nit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.beans.Book;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> viewBooks() {
        return books;
    }
}
