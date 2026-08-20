package com.sub.nit.user.dto;

public class UserRespose {
	private int userId;
	private String userName;
	private int food_id;
	private String food_name;
	private double food_price;

	public UserRespose(int userId, String userName, int food_id, String food_name, double food_price) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_price = food_price;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
