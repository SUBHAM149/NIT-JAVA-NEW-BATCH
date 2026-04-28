package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class PanCard {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;
    private String ch_name;
    private String c_num;
    
    @OneToOne(mappedBy = "card")//use for already fk 
    Person p;
    
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCh_name() {
		return ch_name;
	}
	public void setCh_name(String ch_name) {
		this.ch_name = ch_name;
	}
	public String getC_num() {
		return c_num;
	}
	public void setC_num(String c_num) {
		this.c_num = c_num;
	}
	
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "PanCard [c_id=" + c_id + ", ch_name=" + ch_name + ", c_num=" + c_num + "]";
	}
    
    
    
    
}
