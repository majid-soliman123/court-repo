package com.java.azure_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NamesController {

	@PostMapping("/getName")
	public String getName() {
		return "Majid Soliman On Azure";
	}
	
}
