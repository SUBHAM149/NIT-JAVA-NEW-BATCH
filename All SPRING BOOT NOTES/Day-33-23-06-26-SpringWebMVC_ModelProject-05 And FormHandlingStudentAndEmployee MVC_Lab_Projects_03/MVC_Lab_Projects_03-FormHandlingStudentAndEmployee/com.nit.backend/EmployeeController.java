package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("/employeeForm")
	public String showEmployeeForm() {
		return "employeeform";
	}

	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee(
	        @RequestParam("eid") int eid,
	        @RequestParam("ename") String ename,
	        @RequestParam("dept") String dept,
	        @RequestParam("salary") double salary) {

	    ModelAndView mv = new ModelAndView();

	    mv.addObject("eid", eid);
	    mv.addObject("ename", ename);
	    mv.addObject("dept", dept);
	    mv.addObject("salary", salary);

	    mv.setViewName("employeesuccess");

	    return mv;
	}
}
