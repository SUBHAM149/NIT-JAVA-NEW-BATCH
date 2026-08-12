package com.sub.nit.testing.service;

import java.util.List;

import com.sub.nit.testing.entity.Student;

public interface StudentService {

	public Student saveStudent(Student s);

	public List<Student> getAllStudents();

	public Student getStudentById(int id);

	public Student updateStudent(int id, Student s);

	public void deleteStudent(int id);
}
