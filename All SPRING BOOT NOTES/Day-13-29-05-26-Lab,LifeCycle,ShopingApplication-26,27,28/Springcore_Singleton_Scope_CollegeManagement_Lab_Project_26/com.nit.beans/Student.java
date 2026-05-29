package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("301")
	private int studentId;

	@Value("Subham")
	private String studentName;

	@Autowired
	private BookIssue bookIssue;

	public BookIssue getBookIssue() {
		return bookIssue;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", bookIssue=" + bookIssue + "]";
	}
}
