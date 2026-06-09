package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDAO {

	@Autowired
	private JdbcTemplate template;

	public void savePatient(Patient patient) {

		String query = "INSERT INTO patient VALUES(?,?,?,?)";

		template.update(query, patient.getPatientId(), patient.getPatientName(), patient.getDisease(),
				patient.getAdmissionDate());
	}
}
