package com.sub.training.program02;

import java.util.Set;

public class TrainingInstitute {

	private String instituteName;
	private Set<String> technologies;

	// Setter Injection
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public void setTechnologies(Set<String> technologies) {
		this.technologies = technologies;
	}

	public void displayDetails() {

		System.out.println("========== TRAINING INSTITUTE ==========");
		System.out.println("Institute Name : " + instituteName);

		System.out.println("\nTechnologies Offered:");

		for (String tech : technologies) {
			System.out.println(tech);
		}

		System.out.println("\nTotal Technologies : " + technologies.size());
	}
}
