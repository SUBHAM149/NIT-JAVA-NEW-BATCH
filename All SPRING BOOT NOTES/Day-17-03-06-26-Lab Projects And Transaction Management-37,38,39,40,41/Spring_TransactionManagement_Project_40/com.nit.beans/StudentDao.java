package com.nit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
      public void saveStudent() {
    	  System.out.println("Student saved in Database..");
      }
      
      public void saveCourse() {
    	  System.out.println("Course saved in Database...");
      }
}
