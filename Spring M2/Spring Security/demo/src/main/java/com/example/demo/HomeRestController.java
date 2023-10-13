package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeRestController {
	
	@GetMapping("/home")
	public String appHomePage()
	{
		return "Welcome Page";
	}

}
