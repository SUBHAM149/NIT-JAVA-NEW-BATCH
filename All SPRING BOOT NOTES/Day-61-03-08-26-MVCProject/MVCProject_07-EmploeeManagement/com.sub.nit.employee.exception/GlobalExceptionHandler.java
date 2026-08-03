package com.sub.nit.employee.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleEmployeeNotFoundException(EmployeeNotFoundException exception, Model model) {

		model.addAttribute("errorMessage", exception.getMessage());

		return "error";
	}

	@ExceptionHandler(Exception.class)
	public String handleGlobalException(Exception exception, Model model) {

		model.addAttribute("errorMessage", "Something went wrong: " + exception.getMessage());

		return "error";
	}

}
