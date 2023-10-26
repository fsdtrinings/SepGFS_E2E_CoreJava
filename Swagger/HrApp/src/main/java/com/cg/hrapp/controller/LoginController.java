package com.cg.hrapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.entity.UsersInfo;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"http://localhost:2002", "http://localhost:4200"},allowedHeaders = "*")
public class LoginController {

	
	@GetMapping("/logout")
	public boolean doLogout(HttpServletRequest request)
	{	
		boolean status = false;
		HttpSession session = request.getSession(false);
		session.invalidate();
		status = true;
		return status;
	}
	
	@PostMapping("/login")
	public boolean doLogin(@RequestBody UsersInfo user,HttpServletRequest request)
	{	
		boolean status = false;
		if(user.getUsername().equals("mike") && user.getPassword().equals("123"))
		{
			HttpSession session = request.getSession(true);
			
			session.setAttribute("Username", user.getUsername());
			
			
			
			status = true;
		}
		
		return status;
	}
}
