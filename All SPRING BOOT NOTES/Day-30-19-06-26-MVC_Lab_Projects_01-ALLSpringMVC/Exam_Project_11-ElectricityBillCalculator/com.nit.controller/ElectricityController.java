package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ElectricityController {

	@PostMapping("/bill")
	public ModelAndView bill(@RequestParam("consumerNo") int consumerNo,
			@RequestParam("consumerName") String consumerName, @RequestParam("units") double units,
			@RequestParam("rate") double rate) {

		double total = units * rate;

		ModelAndView mv = new ModelAndView();

		mv.setViewName("result");

		mv.addObject("consumerNo", consumerNo);
		mv.addObject("consumerName", consumerName);
		mv.addObject("units", units);
		mv.addObject("rate", rate);
		mv.addObject("total", total);

		return mv;
	}
}
