package com.rodriguemouadeu.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");
		model.addAttribute("datetime", new Date());
		
		return "welcome";
	}

}