package com.nit.beans;

import org.springframework.transaction.annotation.Transactional;

public class StudentService {

	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void payFee(int studentId, double feeAmount) {

		Student student = dao.getStudentById(studentId);

		if (student == null) {
			throw new RuntimeException("Student Not Found");
		}

		System.out.println("\nStudent Details Before Payment");
		System.out.println(student);

		if (feeAmount <= 0) {
			throw new RuntimeException("Fee Amount Must Be Greater Than Zero");
		}

		if (feeAmount > student.getPendingFee()) {
			throw new RuntimeException("Fee Amount Cannot Exceed Pending Fee");
		}

		double updatedFee = student.getPendingFee() - feeAmount;

		dao.updatePendingFee(studentId, updatedFee);

		Student updatedStudent = dao.getStudentById(studentId);

		System.out.println("\nPayment Amount : " + feeAmount);

		System.out.println("\nTransaction Status : COMMITTED");

		System.out.println("\nStudent Details After Payment");

		System.out.println(updatedStudent);
	}
}
