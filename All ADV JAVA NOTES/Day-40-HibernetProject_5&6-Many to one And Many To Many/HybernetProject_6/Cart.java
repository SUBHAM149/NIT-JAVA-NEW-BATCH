package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Cart {
	    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
       private int c_id;
       private String c_name;
       private String email;
       
	   public int getC_id() {
		   return c_id;
	   }
	   public void setC_id(int c_id) {
		   this.c_id = c_id;
	   }
	   public String getC_name() {
		   return c_name;
	   }
	   public void setC_name(String c_name) {
		   this.c_name = c_name;
	   }
	   public String getEmail() {
		   return email;
	   }
	   public void setEmail(String email) {
		   this.email = email;
	   }
	   @Override
	   public String toString() {
		return "Cart [c_id=" + c_id + ", c_name=" + c_name + ", email=" + email + "]";
	   }
       
       
       
         
}
