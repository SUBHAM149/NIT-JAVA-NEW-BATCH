package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BedAllocationDAO {

	@Autowired
	private JdbcTemplate template;

	public void saveBed(BedAllocation bed) {

		String query = "INSERT INTO bedallocation VALUES(?,?,?,?)";

		template.update(query, bed.getAllocationId(), bed.getPatientId(), bed.getWardName(), bed.getBedNumber());
	}
}
