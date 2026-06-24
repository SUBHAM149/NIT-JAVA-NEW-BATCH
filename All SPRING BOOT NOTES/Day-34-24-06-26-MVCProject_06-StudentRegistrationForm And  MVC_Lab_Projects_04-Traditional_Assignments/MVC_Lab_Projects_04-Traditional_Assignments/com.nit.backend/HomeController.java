package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	@GetMapping("/index")
	public String home() {
		return "../index";
	}

	@GetMapping("/book")
	public String book() {
		return "book";
	}

	@PostMapping("/saveBook")
	public String saveBook(@RequestParam("bookId") int bookId, @RequestParam("bookName") String bookName,
			@RequestParam("authorName") String authorName, @RequestParam("price") double price, Model m) {

		m.addAttribute("title", "Book Registration Details");
		m.addAttribute("data1", bookId);
		m.addAttribute("data2", bookName);
		m.addAttribute("data3", authorName);
		m.addAttribute("data4", price);

		return "result";
	}

	@GetMapping("/patient")
	public String patient() {
		return "patient";
	}

	@PostMapping("/savePatient")
	public String savePatient(@RequestParam("patientId") int patientId, @RequestParam("patientName") String patientName,
			@RequestParam("disease") String disease, @RequestParam("doctorName") String doctorName, Model m) {

		m.addAttribute("title", "Patient Registration Details");
		m.addAttribute("data1", patientId);
		m.addAttribute("data2", patientName);
		m.addAttribute("data3", disease);
		m.addAttribute("data4", doctorName);

		return "result";
	}

	@GetMapping("/course")
	public String course() {
		return "course";
	}

	@PostMapping("/saveCourse")
	public String saveCourse(@RequestParam("studentName") String studentName,
			@RequestParam("courseName") String courseName, @RequestParam("duration") String duration,
			@RequestParam("fee") double fee, Model m) {

		m.addAttribute("title", "Course Enrollment Details");
		m.addAttribute("data1", studentName);
		m.addAttribute("data2", courseName);
		m.addAttribute("data3", duration);
		m.addAttribute("data4", fee);

		return "result";
	}

	@GetMapping("/movie")
	public String movie() {
		return "movie";
	}

	@PostMapping("/saveMovie")
	public String saveMovie(@RequestParam("customerName") String customerName,
			@RequestParam("movieName") String movieName, @RequestParam("tickets") int tickets,
			@RequestParam("showTime") String showTime, Model m) {

		m.addAttribute("title", "Movie Booking Details");
		m.addAttribute("data1", customerName);
		m.addAttribute("data2", movieName);
		m.addAttribute("data3", tickets);
		m.addAttribute("data4", showTime);

		return "result";
	}

	@GetMapping("/hotel")
	public String hotel() {
		return "hotel";
	}

	@PostMapping("/saveHotel")
	public String saveHotel(@RequestParam("customerName") String customerName,
			@RequestParam("roomType") String roomType, @RequestParam("days") int days,
			@RequestParam("contact") String contact, Model m) {

		m.addAttribute("title", "Hotel Reservation Details");
		m.addAttribute("data1", customerName);
		m.addAttribute("data2", roomType);
		m.addAttribute("data3", days);
		m.addAttribute("data4", contact);

		return "result";
	}
}
