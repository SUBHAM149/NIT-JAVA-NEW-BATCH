package com.sub.nit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Book;
import com.sub.nit.repository.BookRepository;
import com.sub.nit.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Book updateBook(Integer id, Book book) {

        Book b = repository.findById(id).orElse(null);

        if (b != null) {
            b.setBookName(book.getBookName());
            b.setAuthorName(book.getAuthorName());
            b.setPrice(book.getPrice());

            return repository.save(b);
        }

        return null;
    }

    @Override
    public String deleteBook(Integer id) {

        repository.deleteById(id);

        return "Book Deleted Successfully";
    }

}
