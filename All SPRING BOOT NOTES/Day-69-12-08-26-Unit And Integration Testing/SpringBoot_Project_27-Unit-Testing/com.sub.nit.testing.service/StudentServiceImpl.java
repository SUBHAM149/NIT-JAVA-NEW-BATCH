package com.sub.nit.testing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sub.nit.testing.entity.Student;
import com.sub.nit.testing.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    // SAVE STUDENT
    @Override
    public Student saveStudent(Student s) {

        return studentRepo.save(s);
    }

    // GET ALL STUDENTS
    @Override
    public List<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    // GET STUDENT BY ID
    @Override
    public Student getStudentById(int id) {

        return studentRepo.findById(id).orElse(null);
    }

    // UPDATE STUDENT
    @Override
    public Student updateStudent(int id, Student s) {

        Student existingStudent =
                studentRepo.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(s.getName());
            existingStudent.setCourse(s.getCourse());
            existingStudent.setMarks(s.getMarks());

            return studentRepo.save(existingStudent);
        }

        return null;
    }

    // DELETE STUDENT
    @Override
    public void deleteStudent(int id) {

        studentRepo.deleteById(id);
    }
}
