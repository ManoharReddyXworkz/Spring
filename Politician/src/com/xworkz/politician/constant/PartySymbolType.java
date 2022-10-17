package com.xworkz.politician.constant;

public enum PartySymbolType {

TV("tv"),
CHAIR("chair"),
BOOK("book"),
FAN("fan"),
PEN("pen"),
TABLE("table"),
WATCHE("watche"),
RADIO("radio"),
FARMER("farmer"),
POT("pot");

 private String type;
 
 private PartySymbolType(String type) {
	 this.type=type;
 } 
	 
 public String getType() {
	return type;
}
 
}
