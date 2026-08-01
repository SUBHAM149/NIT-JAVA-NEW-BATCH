package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.nit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
