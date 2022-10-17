package com.xworkz.politician.dto;

import com.xworkz.politician.constant.PartyNameType;
import com.xworkz.politician.constant.PartySymbolType;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor



public class PoliticianDTO {

	private  int id;
	private String name;
	private PartyNameType partyname;
	private String president;
	private int totalmembers;
	private double partybudject;
	private String headquaters;
	private String partylocation;
	private PartySymbolType partysymbol;
	
		
		
	}

