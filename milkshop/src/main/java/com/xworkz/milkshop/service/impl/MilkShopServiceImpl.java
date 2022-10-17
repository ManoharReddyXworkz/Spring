package com.xworkz.milkshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;

@Service
public class MilkShopServiceImpl implements MilkShopService {

	@Autowired
	private MilkShopDAO milkShopDAO;
	
	
	@Override
	public Boolean saveAndValidate(MilkShopDTO milk) {
		System.out.println("Calling saveAndValidate Method");
		milkShopDAO.save(milk);
		return true;
	}

}
