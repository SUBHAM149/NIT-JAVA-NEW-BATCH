package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("truckservice")
public class TruckService implements VehicleService {
	@Override
	public void performService() {
		System.out.println("Truck servicing completed");
	}
}
