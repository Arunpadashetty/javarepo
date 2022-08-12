package com.trail.service;

import java.util.Arrays;
import java.util.List;

public class Delivery {
	
	List<String> showFood(String type){
		if(type.equalsIgnoreCase("South Indian")) {
		return Arrays.asList("Rice","Dosa","Idli");
		
	}
		if(type.equalsIgnoreCase("North Indian")) {
			return Arrays.asList("Alu paroti","Dall");
			
		}
		return null;

}
	public String greetMessage(String name) {
		System.out.println("Printing..");
		return "Great Day"+name;
		}
	}
