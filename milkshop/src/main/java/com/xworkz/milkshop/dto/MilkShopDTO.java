package com.xworkz.milkshop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Component
@Entity
@Table(name="milkshop")
public class MilkShopDTO {
	@Id
	@GenericGenerator(name = "boss" ,strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String name;
	private String brand;
	private String ownerName;
	private String ambassador;

	public MilkShopDTO() {
		System.out.println("Calling:" + this.getClass().getSimpleName());
	}
}
