package com.nit.backend;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@GetMapping("/demo")
	public String getWelcomePage(Model model)
	{
		model.addAttribute("name","Mona");
		return "welcome";
	}
	
	@GetMapping("/form")
	public String getForm()
	{
		return "userForm";
		
	}
	
    @PostMapping("/submit")
	public String saveForm(@RequestParam("email")String email,Model m)
	{
		m.addAttribute("u_email",email);
		return "profile";
	}
	

}
