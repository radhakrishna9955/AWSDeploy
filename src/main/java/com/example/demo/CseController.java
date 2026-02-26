package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/adityacse")
	public String rocks() {
		return "welcome to aditya cse department";
	}
	@GetMapping("/adityait")
		public String rocks1() {
			return "welcome to jenkins";
		}
}
