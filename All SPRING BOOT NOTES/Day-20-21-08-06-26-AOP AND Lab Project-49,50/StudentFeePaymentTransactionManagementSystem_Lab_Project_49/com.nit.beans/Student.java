package com.nit.beans;

public class Student {

	private int studentId;
	private String studentName;
	private String course;
	private double pendingFee;

	public Student() {
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getPendingFee() {
		return pendingFee;
	}

	public void setPendingFee(double pendingFee) {
		this.pendingFee = pendingFee;
	}

	@Override
	public String toString() {
		return "Student Id : " + studentId + "\nStudent Name : " + studentName + "\nCourse : " + course
				+ "\nPending Fee : " + pendingFee;
	}
}
