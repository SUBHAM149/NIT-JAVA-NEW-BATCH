package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceCenter {

	@Autowired
	@Qualifier("truckservice")
	private VehicleService vehicleService;

	public void serviceVehicle() {
		vehicleService.performService();
	}
}
