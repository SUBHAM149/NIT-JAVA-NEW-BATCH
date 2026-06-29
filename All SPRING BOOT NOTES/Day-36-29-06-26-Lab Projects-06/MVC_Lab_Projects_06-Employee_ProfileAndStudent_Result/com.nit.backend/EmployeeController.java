package com.nit.backend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @RequestMapping("/employee")
    public String showEmployeeForm() {
        return "employee";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee emp, Model model) {
        model.addAttribute("emp", emp);
        return "success";
    }
}
