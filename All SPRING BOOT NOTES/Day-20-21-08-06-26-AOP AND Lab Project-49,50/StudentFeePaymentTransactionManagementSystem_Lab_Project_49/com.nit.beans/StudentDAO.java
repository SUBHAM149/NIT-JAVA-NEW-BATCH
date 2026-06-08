package com.nit.beans;

import java.util.List;

public interface StudentDAO {

    void saveStudent(Student student);

    Student getStudentById(int studentId);

    void updatePendingFee(int studentId,double pendingFee);

    List<Student> getAllStudents();
}
