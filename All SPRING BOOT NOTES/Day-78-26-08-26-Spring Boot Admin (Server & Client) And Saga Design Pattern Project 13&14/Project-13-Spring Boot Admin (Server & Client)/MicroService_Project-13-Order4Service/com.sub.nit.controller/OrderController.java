package com.sub.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order")
	public String getOrders() {
		return "Order Service Is Running";
	}
}
