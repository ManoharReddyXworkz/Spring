package com.xworkz.milkshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.ShirtDAO;
import com.xworkz.milkshop.dto.ShirtDTO;
import com.xworkz.milkshop.service.Shirtservice;

@Service
public class ShirtServiceImpl implements Shirtservice{
	
	@Autowired
	private ShirtDAO shirtDAO;
	
	@Override
	public Boolean saveAndValidate(ShirtDTO shirt) {
		System.out.println("calling saveandvalidation");
		shirtDAO.save(shirt);
		return true;
	}

}
