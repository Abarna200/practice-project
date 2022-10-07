package com.example;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String home() {
		return "Welcome to AWS First Deployment...     DEPLOY SPRINGBOOT TO AWS";
	}

}
