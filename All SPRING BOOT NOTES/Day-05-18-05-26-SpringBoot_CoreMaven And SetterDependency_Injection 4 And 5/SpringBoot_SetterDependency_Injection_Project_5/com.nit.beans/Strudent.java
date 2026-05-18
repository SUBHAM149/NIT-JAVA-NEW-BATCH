package com.nit.beans;

public class Strudent {
      private int s_id;
      private String s_name;
      private int s_age;
      private String s_branch;
      
      Course c;
      
	  public int getS_id() {
		  return s_id;
	  }
	  public void setS_id(int s_id) {
		  this.s_id = s_id;
	  }
	  public String getS_name() {
		  return s_name;
	  }
	  public void setS_name(String s_name) {
		  this.s_name = s_name;
	  }
	  public int getS_age() {
		  return s_age;
	  }
	  public void setS_age(int s_age) {
		  this.s_age = s_age;
	  }
	  public String getS_branch() {
		  return s_branch;
	  }
	  public void setS_branch(String s_branch) {
		  this.s_branch = s_branch;
	  }
	  
	  public Course getC() {
		  return c;
	  }
	  public void setC(Course c) {
		  this.c = c;
	  }
	  
	  
	  @Override
	  public String toString() {
		return "Strudent [s_id=" + s_id + ", s_name=" + s_name + ", s_age=" + s_age + ", s_branch=" + s_branch + ", c="
				+ c + "]";
	  }
	  
      public void display()
      {
    	  System.out.println("Student Id: "+s_id);
    	  System.out.println("Student Name: "+s_name);
    	  System.out.println("Student Age: "+s_age);
    	  System.out.println("Student Branch: "+s_branch);
    	  System.out.println("Student Course: "+c);
      }
      
      
      
      
      
}
