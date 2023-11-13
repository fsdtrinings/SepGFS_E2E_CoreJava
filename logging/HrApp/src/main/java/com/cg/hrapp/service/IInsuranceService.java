package com.cg.hrapp.service;

import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Insurance;

@Service
public interface IInsuranceService {

	public int saveInsurance(Insurance insurance);
	public Insurance getInsuranceByInsuranceCode(int code);
	
}
