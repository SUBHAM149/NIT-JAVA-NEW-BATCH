package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Company {
	@Value("TCS")
	private String companyName;

	@Autowired
	private Employee employee;

	@Autowired
	private Department department;

	public void companyDetails() {
		System.out.println("========== COMPANY DETAILS ==========");

		System.out.println("Company Name : " + companyName);

		System.out.println();

		employee.showEmployee();

		System.out.println();

		department.showDepartment();

		System.out.println();

		employee.work();
	}
}
