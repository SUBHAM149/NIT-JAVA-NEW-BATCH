package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("carService")
public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("Car servicing completed");
	}
}
