package com.sub.nit.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
          
	@GetMapping("/payments")
	public String getPayment() {
		return "Payment Service is Working";
	}
}
