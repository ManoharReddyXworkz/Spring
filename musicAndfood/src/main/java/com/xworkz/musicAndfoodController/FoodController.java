package com.xworkz.musicAndfoodController;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicAndfood.dto.FoodDTO;

@Component
@RequestMapping("/")
public class FoodController {
	
	Collection<FoodDTO>fList = new ArrayList<FoodDTO>();
	
	public FoodController() {
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
@RequestMapping("/getFood.do")	
	public String onSave(FoodDTO food, Model model ) {
		System.out.println("Calling onSave Method");
		System.out.println("Details entered Are:"+food);
		fList.add(food);
		int size = fList.size();
		model.addAttribute("Food",food);
		model.addAttribute("Size", size);
		return "food.jsp";
		
}


	@RequestMapping("/foodview.do")
	public String onSend(FoodDTO food, Model model) {
		System.out.println("Calling onSend Method");
		System.out.println("Details entered Are:"+food);
		model.addAttribute("List", fList);
		return "FoodDetails.jsp";
	}
}
		
		
		