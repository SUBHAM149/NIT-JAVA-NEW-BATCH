package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.security.JwtService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final JwtService jwtService;

	public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder,
			AuthenticationManager authenticationManager, JwtService jwtService) {

		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
		this.jwtService = jwtService;
	}

	public String register(User user) {

		if (userRepository.existsByEmail(user.getEmail())) {

			return "Email already registered";
		}

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		userRepository.save(user);

		return "User registered successfully";
	}

	public String login(String email, String password) {

		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));

		return jwtService.generateToken(email);
	}
}
