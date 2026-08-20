package com.sub.nit.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.course.entity.Course;
import com.sub.nit.course.repository.CourseRepository;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@PostMapping
	public Course addCourse(@RequestBody Course course) {
		return courseRepository.save(course);
	}

	@GetMapping
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable int id) {
		return courseRepository.findById(id).orElse(null);
	}

	@PutMapping("/{id}")
	public Course updateCourse(@PathVariable int id, @RequestBody Course course) {

		course.setCid(id);
		return courseRepository.save(course);
	}

	@DeleteMapping("/{id}")
	public String deleteCourse(@PathVariable int id) {

		courseRepository.deleteById(id);

		return "Course deleted successfully";
	}
}
