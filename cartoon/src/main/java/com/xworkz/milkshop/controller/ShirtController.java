package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.ShirtDTO;

@Controller
@RequestMapping("/shirt")
public class ShirtController {

	public ShirtController() {
	System.out.println("created df controller");
	
	}
	@PostMapping
	public String onSave(ShirtDTO shirtDTO) {
		System.out.println("calling on save method");
		System.out.println("ShirtDTO"+shirtDTO);
		return null;
		
	}
}
