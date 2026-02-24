package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String rocks() {
		return "welcome to jenkins aws";
	}
	@GetMapping("/cse")
		public String rocks1() {
			return "welcome to devops class";
		}
}
