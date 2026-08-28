package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final JwtService service;

	public AuthController(JwtService service) {
		this.service = service;
	}

	@PostMapping("/login")
	public String login(
			@RequestParam String username,
			@RequestParam String password) {

		if (username.equals("subham") && password.equals("1234")) {
			return service.generateToken(username);
		}

		return "Invalid username or password";
	}
}
