package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/college")
	public String college(Model model) {
		model.addAttribute("collegeName", "GIET University");
		model.addAttribute("location", "Gunupur");
		model.addAttribute("course", "MCA");
		return "college";
	}

	@RequestMapping("/student")
	public String student(Model model) {
		model.addAttribute("id", 101);
		model.addAttribute("name", "Subham");
		model.addAttribute("course", "MCA");
		return "student";
	}

	@RequestMapping("/employee")
	public String employee(Model model) {
		model.addAttribute("id", 1001);
		model.addAttribute("name", "Rahul");
		model.addAttribute("salary", 50000);
		return "employee";
	}

	@RequestMapping("/product")
	public String product(Model model) {
		model.addAttribute("id", 201);
		model.addAttribute("name", "Laptop");
		model.addAttribute("price", 65000);
		return "product";
	}

	@RequestMapping("/book")
	public String book(Model model) {
		model.addAttribute("id", 301);
		model.addAttribute("name", "Java Programming");
		model.addAttribute("author", "James Gosling");
		return "book";
	}

	@RequestMapping("/bank")
	public String bank(Model model) {
		model.addAttribute("accountNo", "123456789");
		model.addAttribute("holder", "Subham");
		model.addAttribute("balance", 50000);
		return "bank";
	}

	@RequestMapping("/hospital")
	public String hospital(Model model) {
		model.addAttribute("hospital", "Apollo Hospital");
		model.addAttribute("doctor", "Dr. Sharma");
		model.addAttribute("department", "Cardiology");
		return "hospital";
	}

	@RequestMapping("/mobile")
	public String mobile(Model model) {
		model.addAttribute("mobileName", "Samsung Galaxy S25");
		model.addAttribute("ram", "12GB");
		model.addAttribute("price", 85000);
		return "mobile";
	}

	@RequestMapping("/company")
	public String company(Model model) {
		model.addAttribute("companyName", "TCS");
		model.addAttribute("location", "Hyderabad");
		model.addAttribute("employees", 500000);
		return "company";
	}
}
