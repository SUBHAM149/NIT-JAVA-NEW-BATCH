package com.sub.day11;

import java.util.List;

public class Student {
	public List<String> data;

	public Student() {
// default constructor
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Student [data=" + data + "]";
	}
}
