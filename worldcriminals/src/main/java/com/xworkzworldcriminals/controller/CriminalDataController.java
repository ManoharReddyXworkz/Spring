package com.xworkzworldcriminals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkzworldcriminals.dto.CriminalDTO;
import com.xworkzworldcriminals.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalDataController {

	@Autowired
	private CriminalService criminalService;

	public CriminalDataController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(CriminalDTO criminal, Model model) {
		System.out.println("Calling onSend Method");
		Boolean validateAndSave = criminalService.validateAndSave(criminal);
		if(validateAndSave) {
			System.out.println("Data Entered Are Valid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Criminal Detail");
			return "index";
		}
		else {
			System.out.println("Data Entered Are not Valid");
		return "index";
		}
	}

	
	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling readAll Method");
		List<CriminalDTO> crimeDTO = criminalService.findAll();
		if(crimeDTO != null & !crimeDTO.isEmpty()) {
			System.out.println("The records Are Found"+crimeDTO.size());
			model.addAttribute("CriminalDetails", crimeDTO);
			model.addAttribute("RecordCount","No Of Records Found"+crimeDTO.size());
		}
		else {
			System.out.println("No Records Are Found");
		}
		return "CriminalData";
		
	}
}