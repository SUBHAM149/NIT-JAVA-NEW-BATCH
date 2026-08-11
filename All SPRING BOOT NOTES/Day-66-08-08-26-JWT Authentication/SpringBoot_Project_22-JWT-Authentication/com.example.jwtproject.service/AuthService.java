
package com.example.jwtproject.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.jwtproject.dto.LoginRequest;
import com.example.jwtproject.dto.LoginResponse;
import com.example.jwtproject.entity.User;
import com.example.jwtproject.repository.UserRepository;
import com.example.jwtproject.security.JwtService;

@Service
public class AuthService {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	private final JwtService jwtService;

	public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {

		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
	}

	public String register(User user) {

		if (userRepository.findByUsername(user.getUsername()).isPresent()) {

			return "Username already exists";
		}

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		userRepository.save(user);

		return "User registered successfully";
	}

	public LoginResponse login(LoginRequest request) {

		User user = userRepository.findByUsername(request.getUsername())
				.orElseThrow(() -> new RuntimeException("Username not found"));

		if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {

			throw new RuntimeException("Invalid password");
		}

		String token = jwtService.generateToken(user.getUsername());

		return new LoginResponse(token);
	}
}
