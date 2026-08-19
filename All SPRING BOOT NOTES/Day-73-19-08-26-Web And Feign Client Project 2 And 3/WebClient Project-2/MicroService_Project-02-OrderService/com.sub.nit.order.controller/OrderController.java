package com.sub.nit.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.order.client.ProductClient;
import com.sub.nit.order.entity.Order;
import com.sub.nit.order.entity.Product;

@RestController
@RequestMapping("/orders")
public class OrderController {

	ProductClient client;

	public OrderController(ProductClient productClient) {
		this.client = productClient;
	}

	@GetMapping("/{id}")
	public Map<String, Object> getOrder(@PathVariable int id) {

		Order o = new Order(101, "Subham", 2, 1);

		Product p = client.getProduct(o.getProductId());

		Map<String, Object> map = new HashMap<>();

		map.put("Order", o);
		map.put("product", p);

		return map;
	}
}
