package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Transactional
	public void addEmployee() {

		Employee emp = new Employee(103, "Sona", 70000);

		dao.save(emp);

		//int x = 10 / 0; // Exception

		System.out.println("Transaction Successful");
	}
}
