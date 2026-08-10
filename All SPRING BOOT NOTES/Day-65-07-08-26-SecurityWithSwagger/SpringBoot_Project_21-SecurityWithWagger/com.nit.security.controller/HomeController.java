package com.nit.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// Custom Login Page
	@GetMapping("/login")
	public String login() {

		return "login";

	}

	// Home Page
	@GetMapping("/")
	public String home() {

		return "home";

	}

}
