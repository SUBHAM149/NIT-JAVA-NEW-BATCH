package com.nit.beans;

public class Engine {
	private int e_id;
    private String e_Type;
    private double e_Price;
    
	public Engine(int e_id, String e_Type, double e_Price) {
		super();
		this.e_id = e_id;
		this.e_Type = e_Type;
		this.e_Price = e_Price;
	}

	@Override
	public String toString() {
		return "Engine [e_id=" + e_id + ", e_Type=" + e_Type + ", e_Price=" + e_Price + "]";
	}


	
}
