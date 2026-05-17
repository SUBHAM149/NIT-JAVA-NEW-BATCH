package com.nit.beans;

public class User {
	private int id;
	private String u_name;
	private String u_email;
	private long u_mob_num;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getU_name() {
		return u_name;
	}


	public void setU_name(String u_name) {
		this.u_name = u_name;
	}


	public String getU_email() {
		return u_email;
	}


	public void setU_email(String u_email) {
		this.u_email = u_email;
	}


	public long getU_mob_num() {
		return u_mob_num;
	}


	public void setU_mob_num(long u_mob_num) {
		this.u_mob_num = u_mob_num;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", u_name=" + u_name + ", u_email=" + u_email + ", u_mob_num=" + u_mob_num + "]";
	}


	public void display() {
		System.out.println("User Id is: "+id);
		System.out.println("User Name is: "+u_name);
		System.out.println("User Email is: "+u_email);
		System.out.println("User Mob_num is: "+u_mob_num);
	}
}
