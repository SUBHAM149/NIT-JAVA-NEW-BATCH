package com.nit.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class BankService {
	@PostConstruct
	public void init() {
		System.out.println("Bank Server has been connected.");
	}

	public void transaction() {
		System.out.println("Transaction is happening..");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bank Server has dis-connected.");
	}

}
