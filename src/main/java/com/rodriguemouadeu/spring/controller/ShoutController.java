package com.rodriguemouadeu.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoutController {

	@GetMapping("/shout")
	public String shout(Model model) {

		model.addAttribute("message", "AAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH !!!!!!!!!!!!!");
		model.addAttribute("datetime", new Date());
		
		return "shout";
	}
}