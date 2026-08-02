package com.sub.nit.service;

import java.util.List;
import com.sub.nit.entity.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Integer id);

    Book updateBook(Integer id, Book book);

    String deleteBook(Integer id);

}
