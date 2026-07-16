package com.nit.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Book {

    public void bookInfo() {
        System.out.println("Book Issued Successfully");
    }
}
