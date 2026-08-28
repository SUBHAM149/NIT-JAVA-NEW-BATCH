package com.example.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

	private static final String SECRET_KEY = "MySuperSecretKeyForJwtAuthenticationProject2026";

	private final SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));

	private final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour

	public String generateToken(String email) {

		return Jwts.builder().subject(email).issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).signWith(key).compact();
	}

	public String extractEmail(String token) {

		return extractAllClaims(token).getSubject();
	}

	public boolean isTokenValid(String token) {

		try {

			Claims claims = extractAllClaims(token);

			return claims.getExpiration().after(new Date());

		} catch (Exception e) {

			return false;
		}
	}

	private Claims extractAllClaims(String token) {

		return Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();
	}
}
