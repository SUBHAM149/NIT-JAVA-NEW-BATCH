package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	  @Autowired
	  JdbcTemplate template;
      public void saveStudent() {
    	  String query="INSERT INTO student VALUES(106,'SHAYAM',13,'BCA')";
    	  template.update(query);
      }
      
      public void saveCourse() {
    	  String query="INSERT INTO course VALUES(56,'AJX',1500,'SUDHIR')";
    	  template.update(query);
      }
}
