package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/get")
	public String getName() {
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.println("Hello3");
		return "Hello";
	}
}
