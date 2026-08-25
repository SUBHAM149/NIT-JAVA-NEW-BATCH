package com.sub.nit.controller;

import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.client.ProductClient;

@RestController
public class OrderController {

	private final ProductClient client;
	private final CircuitBreakerFactory circuitBreakerFactory;

	public OrderController(ProductClient client, CircuitBreakerFactory circuitBreakerFactory) {

		this.client = client;
		this.circuitBreakerFactory = circuitBreakerFactory;
	}

	@GetMapping("/Orders/{id}")
	public String getOrder(@PathVariable int id) {

		return circuitBreakerFactory.create("productService").run(() -> {

			String product = client.getProduct(id);

			return "Order is " + id + " Product is: " + product;
		}, throwable -> productFallback(id, throwable));
	}

	public String productFallback(int id, Throwable e) {

		System.out.println("========== CIRCUIT BREAKER FALLBACK ==========");
		System.out.println("Exception: " + e.getClass().getName());
		System.out.println("Message: " + e.getMessage());
		System.out.println("==============================================");

		e.printStackTrace();

		return "Product Service is Not Available. Please Try Again";
	}
}
