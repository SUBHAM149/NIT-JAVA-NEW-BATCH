package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdmissionController {

    @GetMapping("/admission")
    public String admissionForm() {
        return "admission";
    }

    @PostMapping("/confirmAdmission")
    public String confirmAdmission(
            @ModelAttribute Admission ad,
            Model m) {

        m.addAttribute("ad", ad);

        return "confirmation";
    }
    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    @GetMapping("/searchStudent")
    public String searchStudent(
            @RequestParam("admissionNo") int admissionNo,
            @RequestParam("studentName") String studentName,
            Model m) {

        m.addAttribute("admissionNo", admissionNo);
        m.addAttribute("studentName", studentName);

        return "searchResult";
    }
    
}
