package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Order {

	@Value("5001")
	private int orderId;

	@Value("Pizza")
	private String itemName;

	@Value("399.99")
	private double price;

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	}
}
