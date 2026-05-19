package com.nit.beans;

public class Department {

    private int d_id;
    private String d_name;
    private String d_location;
  
    public Department(int d_id, String d_name, String d_location) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_location = d_location;
	}

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_location=" + d_location + "]";
	}


    
}
