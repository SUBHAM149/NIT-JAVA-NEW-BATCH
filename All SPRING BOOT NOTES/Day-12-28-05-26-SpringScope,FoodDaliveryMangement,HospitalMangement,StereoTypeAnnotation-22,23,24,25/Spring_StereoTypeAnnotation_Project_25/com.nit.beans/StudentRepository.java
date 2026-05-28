package com.nit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
      public void display() {
    	  System.out.println("This class is having student databse access.");
      }
}
