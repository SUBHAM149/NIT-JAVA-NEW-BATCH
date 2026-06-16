package com.nit.model;

public class Order {

	private int orderId;
	private int customerId;
	private int productId;
	private int quantity;
	private double totalAmount;

	public Order() {
	}

	public Order(int orderId, int customerId, int productId, int quantity, double totalAmount) {

		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
}
