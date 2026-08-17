package com.sub.nit.patient.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.sub.nit.patient.entity.Doctor;

@Component
public class DoctorClient {

	private RestClient restClient;
	// builder()->It helps to create configure rest client before creating it.
	// baseurl()->This tells to Restclient this is default server address
	// build()->This creates the actual RestClient Object
	// get()->This Tells make an http get request
	// uri()-->which endpoint we have to call
	// Retrieve()-->Send the request and retrieve the response
	// body()-->convert the json object into java object

	// Doctor Service is running in posr number 8081
	public DoctorClient() {
		restClient = RestClient.builder().baseUrl("http://localhost:8081/doctors").build();
	}

	// send http get request to given url get the response and convert json
	// response into java object
	public Doctor getDoctor(int id) {

		return restClient.get().uri("/{id}", id).retrieve().body(Doctor.class);
	}
}
