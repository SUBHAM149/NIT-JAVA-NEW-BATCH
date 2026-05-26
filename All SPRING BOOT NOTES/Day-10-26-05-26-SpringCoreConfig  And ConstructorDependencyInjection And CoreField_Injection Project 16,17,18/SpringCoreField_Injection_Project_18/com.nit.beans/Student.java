package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	    @Value("101")
        private int id;
	    @Value("Aryan")
        private String name;
	    @Value("DS")
        private String branch;
	    @Value("523689")
        private String mob_num;
        
        
        public void display()
        {
        	System.out.println("Id is: "+id);
        	System.out.println("Name is: "+name);
        	System.out.println("Branch is: "+branch);
        	System.out.println("Branch is: "+mob_num);
        }
}
