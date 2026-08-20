package com.sub.nit.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.course.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
