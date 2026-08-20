package com.sub.nit.student.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sub.nit.student.dto.Course;

@FeignClient(
    name = "course-service",
    url = "http://localhost:8080"
)
public interface CourseClient {

    @GetMapping("/courses/{cid}")
    Course getCourseById(@PathVariable("cid") Integer cid);
}
