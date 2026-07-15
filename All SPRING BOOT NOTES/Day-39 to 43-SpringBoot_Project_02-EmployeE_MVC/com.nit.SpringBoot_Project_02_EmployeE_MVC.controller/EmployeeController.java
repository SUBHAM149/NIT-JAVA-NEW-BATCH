package com.nit.SpringBoot_Project_02_EmployeE_MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.nit.SpringBoot_Project_02_EmployeE_MVC.entity.Employee;
import com.nit.SpringBoot_Project_02_EmployeE_MVC.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// Display Home Page
	@GetMapping("/")
	public String home() {
		return "index";
	}

	// Display Employee Registration Form
	@GetMapping("/add")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "addEmployee";
	}

	// Save Employee
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/employee/all";
	}

	// Display All Employees
	@GetMapping("/all")
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", service.getAllEmployees());
		return "viewEmployees";
	}

	// Display Update Form
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable long id, Model model) {
		model.addAttribute("employee", service.getEmployeeById(id));
		return "updateEmployee";
	}

	// Update Employee
	@PostMapping("/update/{id}")
	public String updateEmployee(@PathVariable long id, @ModelAttribute Employee employee) {
		service.updateEmployee(id, employee);
		return "redirect:/employee/all";
	}

	// Delete Employee
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable long id) {
		service.deleteEmployee(id);
		return "redirect:/employee/all";
	}
}
