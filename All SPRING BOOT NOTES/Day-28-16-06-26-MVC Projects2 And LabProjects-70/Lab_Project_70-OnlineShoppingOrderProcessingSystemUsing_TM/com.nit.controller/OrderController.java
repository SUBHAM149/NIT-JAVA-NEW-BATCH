package com.nit.controller;

import com.nit.model.Order;
import com.nit.service.OrderService;

public class OrderController {

	private OrderService service;

	public OrderController(OrderService service) {
		this.service = service;
	}

	public void placeCustomerOrder() {

		try {
 
			Order order = new Order(101, 1001, 1, 2, 100000);

			service.placeOrder(order);

		} catch (Exception e) {

			System.out.println("Transaction Rolled Back");
		}
	}
}
