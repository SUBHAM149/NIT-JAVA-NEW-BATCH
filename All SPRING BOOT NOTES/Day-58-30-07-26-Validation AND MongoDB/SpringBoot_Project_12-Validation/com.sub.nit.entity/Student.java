package com.sub.nit.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Name cannot be empty")
	@Size(min = 3, max = 20, message = "Name should contain 3 to 20 characters")
	private String name;

	@Email(message = "Invalid Email")
	@NotBlank(message = "Email is Required")
	private String email;

	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Enter Valid Mobile Number")
	private String mobile;

	
	public Student() {
	}

	public Student(Integer id, String name, String email, String mobile) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	// Getters and Setters

}
