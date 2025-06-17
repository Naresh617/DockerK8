package com.naresh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello from Spring Boot with Jenkins and Docker!";
	}
	
	@GetMapping("/test")
	public String demo() {
		return "Test";
	}
}