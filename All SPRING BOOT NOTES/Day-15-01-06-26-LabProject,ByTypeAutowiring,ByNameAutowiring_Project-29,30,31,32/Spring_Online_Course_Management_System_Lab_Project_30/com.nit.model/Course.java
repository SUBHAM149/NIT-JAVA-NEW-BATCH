package com.nit.model;

public class Course {

	private Integer courseId;
	private String courseName;
	private String trainerName;
	private Double courseFee;

	public Course(Integer courseId, String courseName, String trainerName, Double courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.trainerName = trainerName;
		this.courseFee = courseFee;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", courseFee=" + courseFee + "]";
	}
}
