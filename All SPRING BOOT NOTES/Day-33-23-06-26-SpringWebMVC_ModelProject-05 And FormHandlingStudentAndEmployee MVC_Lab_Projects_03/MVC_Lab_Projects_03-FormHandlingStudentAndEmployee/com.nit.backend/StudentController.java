package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/studentForm")
	public String showStudentForm() {
		return "studentform";
	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@RequestParam("sid") int sid, @RequestParam("sname") String sname,
			@RequestParam("course") String course, @RequestParam("fee") double fee) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("sid", sid);
		mv.addObject("sname", sname);
		mv.addObject("course", course);
		mv.addObject("fee", fee);

		mv.setViewName("studentsuccess");

		return mv;
	}
}
