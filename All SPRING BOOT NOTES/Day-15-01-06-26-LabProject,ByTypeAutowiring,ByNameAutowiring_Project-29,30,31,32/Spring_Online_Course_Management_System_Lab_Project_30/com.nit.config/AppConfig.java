package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.model.Course;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean
	public Course course1() {
		return new Course(101, "Java Full Stack", "Naresh", 25000.0);
	}

	@Bean
	public Course course2() {
		return new Course(102, "Spring Boot", "Mahesh", 18000.0);
	}

	@Bean
	public Course course3() {
		return new Course(103, "Microservices", "Suresh", 22000.0);
	}
}
