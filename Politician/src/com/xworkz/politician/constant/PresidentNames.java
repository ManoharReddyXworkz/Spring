package com.xworkz.politician.constant;

public enum PresidentNames {

	SIDHRAMYA("sidhramya"),
	DKSHI("dkshi"),
	RK("rk"),
	KUMARSWAMI("kumarswami"),
	JANARDAN("janardan"),
	GOVIND("govind"),
	JCMADHU("jcmadhu"),
	RAVI("ravi"),
	ANIL("anil"),
	MTB("mtb");
	
	
	private String names;
	
	private PresidentNames(String names) {
		this.names=names;
	}
	public String getNames() {
		return names;
	}
}
