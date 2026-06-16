package com.nit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.model.Order;

public class OrderDAO {

	private JdbcTemplate jdbcTemplate;

	public OrderDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getProductStock(int productId) {

		String sql = "select stock from product where productId=?";

		return jdbcTemplate.queryForObject(sql, Integer.class, productId);
	}

	public void updateProductStock(int productId, int quantity) {

		String sql = "update product set stock=stock-? where productId=?";

		jdbcTemplate.update(sql, quantity, productId);

		System.out.println("Stock Updated");
	}

	public void saveOrder(Order order) {

		String sql = "insert into orders values(?,?,?,?,?)";

		jdbcTemplate.update(sql, order.getOrderId(), order.getCustomerId(), order.getProductId(), order.getQuantity(),
				order.getTotalAmount());

		System.out.println("Order Saved");
	}
}
