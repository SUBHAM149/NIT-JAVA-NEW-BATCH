package com.sub.day14_Hospital;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {
	List<Hospital> data;

	public HospitalService() {
	}

	public List<Hospital> getData() {
		return data;
	}

	public void setData(List<Hospital> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HospitalService [data=" + data + "]";
	}

	public Map<String, Integer> getCodeAndName() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		for (Hospital value : data) {
			result.put(value.getHospitalName(), value.getHospitalCode());
		}
		return result;
	}

	public Hospital getDetail(int hospitalCode) {
		Hospital result = null;
		for (Hospital value : data) {
			if (value.getHospitalCode() == hospitalCode) {
				result = value;
			}
		}
		return result;
	}
}
