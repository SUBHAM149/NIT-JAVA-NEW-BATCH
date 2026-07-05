package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sub.model.Student;

@Controller
public class StudentController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute Student student, Model model) {

        model.addAttribute("student", student);

        return "result";
    }

}
