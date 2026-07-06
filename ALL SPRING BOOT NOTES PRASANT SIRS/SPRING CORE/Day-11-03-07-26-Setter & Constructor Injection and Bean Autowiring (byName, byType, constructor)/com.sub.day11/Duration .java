package com.sub.day11;

import java.util.Map;

public class Duration {
	private Map<String, Integer> value;

	public Duration() {
// default constructor
	}

	public Duration(Map<String, Integer> value) {

		super();
		this.value = value;
	}

	public Map<String, Integer> getValue() {
		return value;
	}

	public void setValue(Map<String, Integer> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Duration [value=" + value + "]";
	}
}
