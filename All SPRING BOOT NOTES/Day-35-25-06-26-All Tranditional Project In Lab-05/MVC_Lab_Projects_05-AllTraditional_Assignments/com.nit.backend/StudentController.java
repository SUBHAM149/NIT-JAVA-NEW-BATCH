package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@GetMapping("/")
	public String home() {
	    return "index";
	}
    @GetMapping("/student")
    public String studentForm() {
        return "student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student s, Model m) {

        m.addAttribute("stu", s);

        return "studentsuccess";
    }
}
