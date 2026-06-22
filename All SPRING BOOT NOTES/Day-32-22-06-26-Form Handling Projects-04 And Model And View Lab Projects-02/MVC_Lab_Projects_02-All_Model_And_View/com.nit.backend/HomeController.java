package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/employee")
	public ModelAndView employee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 101);
		mv.addObject("name", "Subham");
		mv.addObject("dept", "Java Full Stack");
		mv.setViewName("employee");
		return mv;
	}

	@RequestMapping("/student")
	public ModelAndView student() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 1001);
		mv.addObject("name", "Rahul");
		mv.addObject("course", "Spring MVC");
		mv.addObject("city", "Hyderabad");
		mv.setViewName("student");
		return mv;
	}

	@RequestMapping("/course")
	public ModelAndView course() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("course", "Spring MVC");
		mv.addObject("trainer", "Naresh IT");
		mv.addObject("duration", "3 Months");
		mv.addObject("fee", "15000");
		mv.setViewName("course");
		return mv;
	}

	@RequestMapping("/library")
	public ModelAndView library() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("library", "Central Library");
		mv.addObject("librarian", "Ramesh");
		mv.addObject("books", 5000);
		mv.setViewName("library");
		return mv;
	}

	@RequestMapping("/hospital")
	public ModelAndView hospital() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("hospital", "Apollo");
		mv.addObject("doctor", "Dr Raj");
		mv.addObject("beds", 300);
		mv.setViewName("hospital");
		return mv;
	}

	@RequestMapping("/movie")
	public ModelAndView movie() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("movie", "Bahubali");
		mv.addObject("director", "Rajamouli");
		mv.addObject("year", 2015);
		mv.setViewName("movie");
		return mv;
	}

	@RequestMapping("/product")
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 201);
		mv.addObject("name", "Laptop");
		mv.addObject("brand", "Dell");
		mv.addObject("price", 65000);
		mv.setViewName("product");
		return mv;
	}

	@RequestMapping("/college")
	public ModelAndView college() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("college", "GIET");
		mv.addObject("principal", "Dr Kumar");
		mv.addObject("location", "Hyderabad");
		mv.setViewName("college");
		return mv;
	}

	@RequestMapping("/team")
	public ModelAndView team() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("team", "India");
		mv.addObject("captain", "Rohit Sharma");
		mv.addObject("ground", "Wankhede Stadium");
		mv.setViewName("team");
		return mv;
	}

	@RequestMapping("/travel")
	public ModelAndView travel() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("place", "Araku Valley");
		mv.addObject("state", "Andhra Pradesh");
		mv.addObject("famous", "Coffee Plantations");
		mv.setViewName("travel");
		return mv;
	}

	@RequestMapping("/university")
	public ModelAndView university() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("uname", "JNTU Hyderabad");
		mv.addObject("vc", "Dr Srinivas");
		mv.addObject("location", "Hyderabad");
		mv.addObject("year", 1972);
		mv.addObject("colleges", 450);
		mv.setViewName("university");
		return mv;
	}
}
