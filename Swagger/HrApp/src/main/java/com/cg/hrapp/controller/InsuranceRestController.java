package com.cg.hrapp.controller;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.entity.Insurance;
import com.cg.hrapp.service.IInsuranceService;

@RestController
@RequestMapping("/ins")
@CrossOrigin(origins = {"http://localhost:2002", "http://localhost:4200"},allowedHeaders = "*")
public class InsuranceRestController {

	@Autowired
	IInsuranceService insuranceService;
	
	public InsuranceRestController() {
		System.out.println("Insurance Rest Controller Constructor called");
	}
	
	@PostMapping("/submit")
	public int addInsuranceEndPoint(@RequestBody Insurance insurance)
	{
		int  savedInsuranceCode = insuranceService.saveInsurance(insurance);
		return savedInsuranceCode;
	}
	
	@GetMapping("")
	public Insurance getInsurance(@RequestParam int code)
	{
		return insuranceService.getInsuranceByInsuranceCode(code);
	}
	
	
}
