package com.xworkzworldcriminals.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "criminaldetails")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select criminal from CriminalDTO criminal") })



public class CriminalDTO {

	@Id
	@GenericGenerator(name = "crime", strategy = "increment")
	@GeneratedValue(generator = "crime")
	private Integer id;
	private String criminalName;
	private String criminalAge;
	private String country;
	private String criminalType;
	private String noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private String jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private String netWorth;

	public CriminalDTO() {

		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}
	
	
}
