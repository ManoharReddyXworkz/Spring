package com.xworkz.java8features;

import java.util.ArrayList;
import java.util.Collection;

public class StreamFeatures {
	
public static void main(String[] args) {
	
		
		Collection<String> states = new ArrayList<String>();
		
			states.add("Andhra Pradesh");
			states.add("Panjab");
			states.add("Uttar Pradesh");
			states.add("Assam");
			states.add("Karnataka");
			states.add("Tamil Nadu");
			states.add("Gujurat");
			states.add("Goa");
			states.add("Odisha");
			states.add("Haryana");
			states.add("Madhya Pradesh");
			states.add("Himachal Pradesh");
			states.add("Arunachal Pradesh");
			states.add("Maharashtra");
			states.add("Tripura");
			states.add("Meghalaya");
			states.add("Kerala");
			states.add("Uttarakhand");
			states.add("West Bengal");
			states.add("Chhattisgarh");
			states.add("Sikkim");
			states.add("Mizoram");
			states.add("Rajasthan");
			states.add("Manipur");
			states.add("Bihar");
			states.add("Jharkhand");
			states.add("Nagaland");
			states.add("Telangana");
			states.add("Delhi");
			states.add("Jammu & Kashmir");
			
			System.out.println("No Of States Present");
			System.out.println(states.size());
			System.out.println("------------------------------");
			System.out.println("Loop EveryThing");
			states.stream().forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Converting to uppercase");
			states.stream().forEach((ref)->System.out.println(ref.toUpperCase()));
			System.out.println("Converting to Lowercase");
			System.out.println("----------------------------");
			states.stream().forEach((ref)->System.out.println(ref.toLowerCase()));
			System.out.println("----------------------------");
			System.out.println("Ending with a");
			states.stream().filter((ref)->ref.endsWith("a")).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Starts with k");
			states.stream().filter((ref)->ref.startsWith("K")).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Contains L");
			states.stream().filter((ref)->ref.contains("L")).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Contains D");
			states.stream().filter((ref)->ref.contains("D")).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Contains H");
			states.stream().filter((ref)->ref.contains("h")).forEach((ref)->System.out.println());
			System.out.println("------------------------------");
			System.out.println("Contains R");
			states.stream().filter((ref)->ref.contains("r")).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("String greater than 10");
			states.stream().filter((ref)->ref.length()>10).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("String lesser than 5");
			states.stream().filter((ref)->ref.length()<5).forEach((ref)->System.out.println(ref));
			System.out.println("----------------------------");
			System.out.println("Reverse Of String");
			states.stream().forEach((ref)->System.out.println(new StringBuffer().append(ref).reverse()));
		    System.out.println("----------------------------");
	}

}
