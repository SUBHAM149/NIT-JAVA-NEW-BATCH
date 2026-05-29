package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("NIT College")
    private String collegeName;

    @Value("Hyderabad")
    private String location;

    @Autowired
    private Principal principal;

    public Principal getPrincipal() {
        return principal;
    }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName +
                ", location=" + location +
                ", principal=" + principal + "]";
    }
}
