package com.example.security;

import com.example.service.CustomUserDetailsService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpStatus;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

	private final JwtAuthenticationFilter jwtAuthenticationFilter;
	private final CustomUserDetailsService userDetailsService;

	public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter,
			CustomUserDetailsService userDetailsService) {

		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
		this.userDetailsService = userDetailsService;
	}

	// ================================
	// Security Filter Chain
	// ================================

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http
				// Disable CSRF
				.csrf(csrf -> csrf.disable())

				// JWT is stateless
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

				// Authorization
				.authorizeHttpRequests(auth -> auth

						// Public APIs
						.requestMatchers("/auth/register", "/auth/login").permitAll()

						// Protected APIs
						.requestMatchers("/user/**").authenticated()

						// All other requests
						.anyRequest().authenticated())

				// Authentication provider
				.authenticationProvider(authenticationProvider())

				// Convert unauthenticated request to 401
				.exceptionHandling(exception -> exception.authenticationEntryPoint(authenticationEntryPoint()))

				// JWT filter
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}

	// ================================
	// Authentication Entry Point
	// ================================

	@Bean
	public AuthenticationEntryPoint authenticationEntryPoint() {

		return (request, response, authException) -> {

			response.setStatus(HttpStatus.UNAUTHORIZED.value());

			response.setContentType("application/json");

			response.getWriter().write("{\"error\":\"Unauthorized\",\"message\":\"JWT token is required\"}");
		};
	}

	// ================================
	// Authentication Provider
	// ================================

	@Bean
	public AuthenticationProvider authenticationProvider() {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);

		provider.setPasswordEncoder(passwordEncoder());

		return provider;
	}

	// ================================
	// Password Encoder
	// ================================

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	// ================================
	// Authentication Manager
	// ================================

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {

		return configuration.getAuthenticationManager();
	}
}
