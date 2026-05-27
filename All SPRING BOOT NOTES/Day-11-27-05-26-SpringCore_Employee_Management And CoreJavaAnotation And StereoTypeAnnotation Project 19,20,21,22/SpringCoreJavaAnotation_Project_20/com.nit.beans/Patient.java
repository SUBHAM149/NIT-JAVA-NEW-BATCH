package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	   @Value("101")
       private int p_id;
	   @Value("Mona")
       private String p_name;
	   @Value("30")
       private int p_age;
       
       public void details()
       {
    	   System.out.println("Patient Id is: "+p_id);
    	   System.out.println("Patient Name is: "+p_name);
    	   System.out.println("Patient Age is: "+p_age);
       }
}
