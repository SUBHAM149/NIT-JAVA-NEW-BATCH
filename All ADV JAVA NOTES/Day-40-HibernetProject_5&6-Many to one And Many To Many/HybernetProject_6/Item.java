package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Item {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
         private int i_id;
         private String name;
         private double price;
         private String descp;
         
         @ManyToOne
         private Cart c;
         
		 public int getI_id() {
			 return i_id;
		 }
		 public void setI_id(int i_id) {
			 this.i_id = i_id;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setName(String name) {
			 this.name = name;
		 }
		 public double getPrice() {
			 return price;
		 }
		 public void setPrice(double price) {
			 this.price = price;
		 }
		 public String getDescp() {
			 return descp;
		 }
		 public void setDescp(String descp) {
			 this.descp = descp;
		 }
		 
		 
		 public Cart getC() {
			return c;
		}
		 public void setC(Cart c) {
			 this.c = c;
		 }
		 
		 @Override
		 public String toString() {
			return "Item [i_id=" + i_id + ", name=" + name + ", price=" + price + ", descp=" + descp + "]";
		 }
         
         
         
}
