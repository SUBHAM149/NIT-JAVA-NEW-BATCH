package com.sub.day11;

import java.util.List;
import java.util.Map;

public class CourseDetail {
	private List<Duration> duration;
	private Map<Student, Course> detail;

	public CourseDetail() {
// default constructor
	}

	public CourseDetail(List<Duration> duration, Map<Student, Course> detail) {
		super();
		this.duration = duration;
		this.detail = detail;

	}

	public List<Duration> getDuration() {
		return duration;
	}

	public void setDuration(List<Duration> duration) {
		this.duration = duration;
	}

	public Map<Student, Course> getDetail() {
		return detail;
	}

	public void setDetail(Map<Student, Course> detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CourseDetail [duration=" + duration + ", detail=" + detail + "]";
	}
}
