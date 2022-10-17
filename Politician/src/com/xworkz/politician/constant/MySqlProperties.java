package com.xworkz.politician.constant;

public enum MySqlProperties {

URL("jdbc:mysql://Localhost:3306/politician"),
USERNAME("root"),
SECRET("s1820923");
	
	private String value;
	MySqlProperties(String value){
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}
}
