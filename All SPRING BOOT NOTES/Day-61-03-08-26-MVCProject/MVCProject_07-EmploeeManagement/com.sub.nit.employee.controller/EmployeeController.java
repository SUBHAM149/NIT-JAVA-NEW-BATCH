package com.sub.nit.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.employee.entity.Employee;
import com.sub.nit.employee.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String home() {
	    return "index";
	}

	@GetMapping
	public String getAllEmployees(Model model) {

		model.addAttribute("employees", employeeService.getAllEmployees());

		return "employees";
	}
	
	

	@GetMapping("/add")
	public String showAddEmployeeForm(Model model) {

		model.addAttribute("employee", new Employee());

		return "add_employee";
	}

	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {

		if (result.hasErrors()) {
			return "add_employee";
		}

		employeeService.saveEmployee(employee);

		return "redirect:/employees";
	}

	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable Integer id, Model model) {

		Employee employee = employeeService.getEmployeeById(id);

		model.addAttribute("employee", employee);

		return "update_employee";
	}

	@PostMapping("/update")
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {

		if (result.hasErrors()) {
			return "update_employee";
		}

		employeeService.updateEmployee(employee);

		return "redirect:/employees";
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {

		employeeService.deleteEmployee(id);

		return "redirect:/employees";
	}

}
