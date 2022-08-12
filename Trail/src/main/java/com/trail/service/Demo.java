package com.trail.service;

import java.util.List;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a type: ");
		String type=ip.next();
		
		Delivery delivery=new Delivery();
		String msg=delivery.greetMessage("priya");
		System.out.println(msg);
		List<String> foodList=delivery.showFood(type);
		System.out.println(foodList);
	}

}
