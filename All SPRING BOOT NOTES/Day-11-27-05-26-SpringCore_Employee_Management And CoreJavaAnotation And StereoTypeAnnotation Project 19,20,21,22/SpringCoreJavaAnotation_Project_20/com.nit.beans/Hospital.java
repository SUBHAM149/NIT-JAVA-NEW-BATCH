package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	  @Value("Subham")
      private String h_name;
	  @Value("Odisha")
      private String h_adress;
      
	 @Autowired
     Patient p;
      
      public void display()
      {
    	  System.out.println("Hospital Name is: "+h_name);
    	  System.out.println("Hospital Adress is: "+h_adress);
    	  p.details();
      }
}
