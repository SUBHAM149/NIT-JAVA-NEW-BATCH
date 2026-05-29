package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookIssue {

	@Value("9001")
	private int issueId;

	@Value("Java Programming")
	private String bookName;

	@Value("29-05-2026")
	private String issueDate;

	@Override
	public String toString() {
		return "BookIssue [issueId=" + issueId + ", bookName=" + bookName + ", issueDate=" + issueDate + "]";
	}
}
