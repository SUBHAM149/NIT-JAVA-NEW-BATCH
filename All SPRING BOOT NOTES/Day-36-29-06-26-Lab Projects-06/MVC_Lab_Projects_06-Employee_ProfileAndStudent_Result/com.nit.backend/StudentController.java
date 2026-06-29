package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    // @RequestParam
    @RequestMapping("/calculate")
    public String calculate(
            @RequestParam("name") String name,
            @RequestParam("course") String course,
            @RequestParam("marks") int marks,
            Model model) {

        double percentage = marks;
        String result = (marks >= 35) ? "Pass" : "Fail";

        model.addAttribute("name", name);
        model.addAttribute("course", course);
        model.addAttribute("marks", marks);
        model.addAttribute("percentage", percentage);
        model.addAttribute("result", result);

        return "result";
    }

    // @PathVariable
    @RequestMapping("/student/result/{rollNo}")
    public String showRoll(
            @PathVariable("rollNo") int rollNo,
            Model model) {

        model.addAttribute("rollNo", rollNo);
        model.addAttribute("message", "Result Generated Successfully");

        return "result";
    }
}
