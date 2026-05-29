package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("201")
	private int customerId;

	@Value("Rahul")
	private String customerName;

	@Autowired
	private Order order;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", order=" + order + "]";
	}
}
