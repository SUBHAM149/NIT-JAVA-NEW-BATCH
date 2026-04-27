package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Course {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;
    private String c_name;
    private double fee;
    
    
    
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", fee=" + fee + "]";
	}
    
   
     
}
