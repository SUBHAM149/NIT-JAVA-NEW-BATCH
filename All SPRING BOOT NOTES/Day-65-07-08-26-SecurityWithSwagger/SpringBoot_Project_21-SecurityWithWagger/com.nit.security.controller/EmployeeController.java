package com.nit.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.security.entity.Employee;
import com.nit.security.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// Display All Employees
	@GetMapping
	public String getAllEmployees(Model model) {

		model.addAttribute("employees", service.getAllEmployees());

		return "employees";

	}

	// Open Add Employee Page
	@GetMapping("/add")
	public String addEmployee(Model model) {

		model.addAttribute("employee", new Employee());

		return "addEmployee";

	}

	// Save Employee
	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {

		if (result.hasErrors()) {

			return "addEmployee";

		}

		service.saveEmployee(employee);

		return "redirect:/employees";

	}

	// Open Edit Page
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id, Model model) {

		Employee employee = service.getEmployeeById(id);

		if (employee == null) {

			return "redirect:/employees";

		}

		model.addAttribute("employee", employee);

		return "editEmployee";

	}

	// Update Employee
	@PostMapping("/update")
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {

		if (result.hasErrors()) {

			return "editEmployee";

		}

		service.updateEmployee(employee);

		return "redirect:/employees";

	}

	// Delete Employee
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {

		service.deleteEmployee(id);

		return "redirect:/employees";

	}

}
