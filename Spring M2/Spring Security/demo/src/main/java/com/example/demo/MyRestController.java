package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class MyRestController {

	@GetMapping("/hello")
	public String hello()
	{
		return "Admin-Hello";
	}
}
