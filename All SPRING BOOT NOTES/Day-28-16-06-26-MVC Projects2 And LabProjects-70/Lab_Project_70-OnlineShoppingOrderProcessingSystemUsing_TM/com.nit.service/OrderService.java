package com.nit.service;

import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.OrderDAO;
import com.nit.model.Order;

public class OrderService {

	private OrderDAO dao;

	public OrderService(OrderDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void placeOrder(Order order) {

		System.out.println("Transaction Started");

		int stock = dao.getProductStock(order.getProductId());

		if (stock < order.getQuantity()) {

			System.out.println("Insufficient Stock");

			throw new RuntimeException("Stock Not Available");
		}

		dao.updateProductStock(order.getProductId(), order.getQuantity());

		dao.saveOrder(order);

		System.out.println("Transaction Committed");
	}
}
