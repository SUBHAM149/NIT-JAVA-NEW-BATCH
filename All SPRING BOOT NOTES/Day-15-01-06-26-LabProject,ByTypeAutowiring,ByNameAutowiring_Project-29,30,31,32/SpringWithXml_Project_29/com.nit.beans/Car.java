package com.nit.beans;

public class Car {

	private String c_name;
	private long c_mum;
	private Engine engine;

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public void setC_mum(long c_mum) {
		this.c_mum = c_mum;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [c_name=" + c_name + ", c_mum=" + c_mum + ", engine=" + engine + "]";
	}
}
