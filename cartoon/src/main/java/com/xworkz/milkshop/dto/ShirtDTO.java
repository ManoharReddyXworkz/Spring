package com.xworkz.milkshop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Table(name="branddata")
@ToString
@Entity

public class ShirtDTO {

	@Id
	@GenericGenerator( name = "shirt" , strategy = "increment")
	@GeneratedValue(generator =  "shirt" )
	private Integer bid;
	private String brand;
	private String size;
	private String price;
	private String discount;
	private String quantity;
	private String gender;
	private String color;
	
public ShirtDTO() {
	System.out.println("calling default constructor");
}
}
