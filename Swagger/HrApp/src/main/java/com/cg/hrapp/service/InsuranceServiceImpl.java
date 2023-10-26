package com.cg.hrapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Insurance;
import com.cg.hrapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Autowired
	IInsuranceRepository insuranceRepository;
	
	
	@Override
	public int saveInsurance(Insurance insurance) {
		
		int insCode = 0;
		if(insurance != null)
		{
			 Insurance savedInsurance = insuranceRepository.save(insurance);
			 insCode = savedInsurance.getInsuranceCode();
			 
		}
		
		return insCode;
	}

	@Override
	public Insurance getInsuranceByInsuranceCode(int code) {
		
		return insuranceRepository.findById(code).get();
	}

}
