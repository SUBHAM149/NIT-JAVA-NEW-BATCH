package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
