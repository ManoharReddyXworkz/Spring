package com.xworkz.politician.constant;

public enum PartyNameType {

	JDS("jds"),BJP("bjp"),AIAMDK("aiamdk"),CPI("cpi"),INC("inc"),YSR("ysr"),TDP("tdp"),
	NKP("nkp"),CJD("cjd"),MJD("mjd");
	
	private String name;
	
	private PartyNameType(String name) {
		this.name=name;
		

	}
	
	public String getName() {
		return name;
	}

	Object getByName(String pname) {
		// TODO Auto-generated method stub
		return null;
	}
}
