package com.sub.nit.order.entity;

public class Order {

	private int orderId;
	private String orderName;
	private int productId;
	private int quantity;

	public Order() {
	}

	public Order(int orderId, String orderName, int productId, int quantity) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", productId=" + productId + ", quantity="
				+ quantity + "]";
	}
}
