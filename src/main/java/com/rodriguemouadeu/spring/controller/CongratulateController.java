package com.rodriguemouadeu.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CongratulateController {

	@GetMapping("/applause")
	public String applause(Model model) {

		model.addAttribute("message", "Well done !!! Clap, clap clap");
		model.addAttribute("datetime", new Date());
		
		return "applause";
	}
}