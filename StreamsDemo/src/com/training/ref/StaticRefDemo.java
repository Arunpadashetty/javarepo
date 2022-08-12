package com.training.ref;

public class StaticRefDemo {

	public static void main(String[] args) {
		//using lambda method 
		Calculator calculator=(int x, int y)->System.out.println(x+y);		
		calculator.calculator(10,20);
		

		//using ref for static method
		Calculator ref=Checker::printTotal;
		ref.calculator(10,20);
		
		//using lambda method 
		IGreeter greeter= (String name)->System.out.println("Wel come "+name);
		greeter.greetMessage("to Kingdom");
		
		//Create an object of checker
		Checker checkobj=new Checker();
		//refer to nonstatic method using object
		IGreeter ref1=checkobj::show;
		ref1.greetMessage("King");
	}

}
