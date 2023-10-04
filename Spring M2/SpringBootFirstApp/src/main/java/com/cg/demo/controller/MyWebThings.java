package com.cg.demo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cg")
public class MyWebThings {
	
	public MyWebThings() {
		System.out.println("--- Contructor called ");
	}

	@GetMapping("/hello")
	public String hello(HttpServletRequest req)
	{
		LocalDate date = LocalDate.now();
		System.out.println(" --- inside hello ---"+req.getContextPath().toString());
		return "Hello Spring "+req.getContextPath().toString()+" - "+date;
	}
	
}
