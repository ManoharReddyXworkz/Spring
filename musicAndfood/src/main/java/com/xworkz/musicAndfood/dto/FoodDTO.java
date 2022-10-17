package com.xworkz.musicAndfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FoodDTO {
	private String foodName;
	private String price;
	private String hotelName;
	private String type;
	private String location;
	private String order;
	private String quantity;

	public FoodDTO() {

		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
}


