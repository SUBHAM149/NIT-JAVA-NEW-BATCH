package com.sub.nit.exception;

public class CustomerNotFoundException extends RuntimeException {

    // Default Constructor
    public CustomerNotFoundException() {
        super();
    }

    // Parameterized Constructor
    public CustomerNotFoundException(String message) {
        super(message);
    }

}
