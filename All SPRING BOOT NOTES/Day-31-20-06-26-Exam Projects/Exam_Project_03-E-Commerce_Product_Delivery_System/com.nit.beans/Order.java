package com.nit.beans;

public class Order {
	private int orderId;
	private String productName;
	private double orderAmount;
	private DeliveryPartner partner;

	public Order(DeliveryPartner partner) {
		this.partner = partner;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + ", orderAmount=" + orderAmount
				+ ", partner=" + partner + "]";
	}
}
