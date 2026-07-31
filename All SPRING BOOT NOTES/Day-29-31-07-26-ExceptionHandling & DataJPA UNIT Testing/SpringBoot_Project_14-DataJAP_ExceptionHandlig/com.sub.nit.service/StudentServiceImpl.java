package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Student;
import com.sub.nit.exception.StudentNotFoundException;
import com.sub.nit.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) { 

		return repository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student ID " + id + " not found"));
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {

		Student st = repository.findById(student.getId())
				.orElseThrow(() -> new StudentNotFoundException("Student ID " + student.getId() + " not found"));

		st.setName(student.getName());
		st.setCourse(student.getCourse());

		return repository.save(st);
	}

	@Override
	public void deleteStudent(Integer id) {

		Student st = repository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student ID " + id + " not found"));

		repository.delete(st);
	}

}
