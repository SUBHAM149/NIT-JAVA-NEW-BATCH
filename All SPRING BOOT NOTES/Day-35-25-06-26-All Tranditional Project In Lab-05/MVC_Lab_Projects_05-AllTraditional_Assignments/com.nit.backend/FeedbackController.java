package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String feedbackForm() {
        return "customer";
    }

    @PostMapping("/saveFeedback")
    public String saveFeedback(
            @ModelAttribute Feedback fb,
            Model m) {

        m.addAttribute("fb", fb);

        return "feedback";
    }
}
