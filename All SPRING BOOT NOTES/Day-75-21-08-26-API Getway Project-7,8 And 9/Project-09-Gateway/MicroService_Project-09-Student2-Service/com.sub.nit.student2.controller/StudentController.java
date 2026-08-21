package com.sub.nit.student2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class StudentController {

	private final RestClient.Builder restClientBuilder;

	public StudentController(RestClient.Builder restClientBuilder) {
		this.restClientBuilder = restClientBuilder;
	}

	@GetMapping("/student2")
	public String getStudent() {

		return restClientBuilder.build().get().uri("http://COURSE-SERVICE/course").retrieve().body(String.class);
	}
}
