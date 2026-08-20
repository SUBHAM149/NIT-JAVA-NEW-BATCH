package com.sub.nit.user.dto;

public class FoodItem {
	private int food_id;
	private String food_name;
	private double food_price;

	public FoodItem() {

	}

	public FoodItem(int food_id, String food_name, double food_price) {
		super();
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_price = food_price;
	}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public double getFood_price() {
		return food_price;
	}

	public void setFood_price(double food_price) {
		this.food_price = food_price;
	}

	@Override
	public String toString() {
		return "FoodItem [food_id=" + food_id + ", food_name=" + food_name + ", food_price=" + food_price + "]";
	}

}
