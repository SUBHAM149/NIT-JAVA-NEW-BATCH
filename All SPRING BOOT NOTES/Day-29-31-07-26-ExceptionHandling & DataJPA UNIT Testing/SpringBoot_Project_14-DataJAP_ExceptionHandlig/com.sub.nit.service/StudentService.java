package com.sub.nit.service;

import java.util.List;
import com.sub.nit.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Integer id);

}
