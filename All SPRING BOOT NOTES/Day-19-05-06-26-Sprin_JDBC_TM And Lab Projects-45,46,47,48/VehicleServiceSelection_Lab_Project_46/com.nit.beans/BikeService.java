package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("bikeservice")
public class BikeService implements VehicleService {
	@Override
	public void performService() {
		System.out.println("BikeService servicing completed");
	}

}
