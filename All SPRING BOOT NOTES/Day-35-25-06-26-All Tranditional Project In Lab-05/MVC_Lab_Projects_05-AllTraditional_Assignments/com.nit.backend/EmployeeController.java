package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String employeeForm() {
        return "employee";
    }

    @PostMapping("/salary")
    public ModelAndView calculateSalary(
            @RequestParam("empName") String empName,
            @RequestParam("basicSalary") double basicSalary,
            @RequestParam("bonus") double bonus) {

        double totalSalary = basicSalary + bonus;

        ModelAndView mv = new ModelAndView();

        mv.addObject("name", empName);
        mv.addObject("basic", basicSalary);
        mv.addObject("bonus", bonus);
        mv.addObject("total", totalSalary);

        mv.setViewName("salary");

        return mv;
    }
}
