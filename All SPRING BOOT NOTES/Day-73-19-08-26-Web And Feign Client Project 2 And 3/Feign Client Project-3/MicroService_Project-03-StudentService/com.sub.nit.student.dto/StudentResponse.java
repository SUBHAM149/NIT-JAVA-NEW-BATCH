package com.sub.nit.student.dto;

public class StudentResponse {

	private Integer studentId;

	private String studentName;

	private Integer courseId;

	private Integer cid;

	private String cname;

	private double cfees;

	public StudentResponse() {
	}

	public StudentResponse(Integer studentId, String studentName, Integer courseId, Integer cid, String cname,
			double cfees) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCfees() {
		return cfees;
	}

	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
}
