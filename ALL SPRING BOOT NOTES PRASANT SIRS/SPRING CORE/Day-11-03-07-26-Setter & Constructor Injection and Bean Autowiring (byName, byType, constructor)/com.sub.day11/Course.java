package com.sub.day11;

import java.util.Set;

public class Course {
	private Set<String> courseName;

	public Course() {
// default constructor
	}

	public Course(Set<String> courseName) {
		super();
		this.courseName = courseName;
	}

	public Set<String> getCourseName() {
		return courseName;
	}

	public void setCourseName(Set<String> courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
}
