package com.nit.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping("/home")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/aboutUs")
    public String getAboutUsPage(Model m) {
        m.addAttribute("msg", "Welcome To Naresh IT");
        return "aboutUs";
    }

    @GetMapping("/form")
    public String getFormPage() {
        return "registration";
    }

    @PostMapping("/submit")
    public ModelAndView saveStudent(@ModelAttribute Student s) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("student", s);
        mav.setViewName("profile");

        return mav;
    }
}
