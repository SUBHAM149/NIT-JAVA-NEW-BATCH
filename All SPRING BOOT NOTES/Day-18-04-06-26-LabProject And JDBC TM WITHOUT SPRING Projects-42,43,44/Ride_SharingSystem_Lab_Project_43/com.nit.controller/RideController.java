package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.beans.PaymentMethod;
import com.nit.beans.Vehicle;

@Component
public class RideController {

	@Autowired
	@Qualifier("car")
	private Vehicle car;

	@Autowired
	@Qualifier("bike")
	private Vehicle bike;

	@Autowired
	@Qualifier("auto")
	private Vehicle auto;

	@Autowired
	@Qualifier("cardPayment")
	private PaymentMethod cardPayment;

	@Autowired
	@Qualifier("walletPayment")
	private PaymentMethod walletPayment;

	@Autowired
	@Qualifier("cashPayment")
	private PaymentMethod cashPayment;

	public void bookCar(double amount) {
		System.out.println(car.ride());
		System.out.println(cardPayment.pay(amount));
		System.out.println();
	}

	public void bookBike(double amount) {
		System.out.println(bike.ride());
		System.out.println(walletPayment.pay(amount));
		System.out.println();
	}

	public void bookAuto(double amount) {
		System.out.println(auto.ride());
		System.out.println(cashPayment.pay(amount));
		System.out.println();
	}
}
