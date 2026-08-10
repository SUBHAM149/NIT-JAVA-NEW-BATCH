package com.nit.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {

		UserDetails user = User.builder().username("admin").password(encoder.encode("admin")).roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	    http.csrf(csrf -> csrf.disable())

	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers(
	                    "/login",
	                    "/swagger-ui/**",
	                    "/swagger-ui.html",
	                    "/v3/api-docs/**",
	                    "/api/employees/**"
	            )
	            .permitAll()
	            .anyRequest()
	            .authenticated())

	        .formLogin(login -> login
	            .loginPage("/login")
	            .defaultSuccessUrl("/employees/add", true)
	            .permitAll())

	        .logout(logout -> logout
	            .logoutSuccessUrl("/login")
	            .permitAll());

	    return http.build();
	}
}
