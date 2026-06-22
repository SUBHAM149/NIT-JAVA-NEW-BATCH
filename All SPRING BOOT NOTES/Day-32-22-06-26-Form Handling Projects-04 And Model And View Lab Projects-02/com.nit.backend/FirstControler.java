package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstControler {
	
	@GetMapping("/index")
	public String home() {
	    return "index";
	}

	@GetMapping("/form")
	public String getForm() {
		return "form";
	}

	@PostMapping("/submit")
	public ModelAndView saveForm(@RequestParam("name") String name, ModelAndView mav) {
		mav.addObject("msg", name);
		mav.setViewName("profile");
		return mav;
	}
}
