package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Order;

public interface OrderService {

	// Save Order
	public Order saveOrder(Order order);

	// Get All Orders
	public List<Order> getAllOrders();

	// Get Order By Id
	public Order getOrderById(Integer id);

	// Update Order
	public Order updateOrder(Integer id,Order order);

	// Delete Order
	public String deleteOrder(Integer id);

}
