package com.nit.beans;

import java.util.Set;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String designation;
	private Set<String> projects;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", projects=" + projects + "]";
	}
}
