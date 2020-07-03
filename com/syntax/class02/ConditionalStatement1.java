package com.syntax.class02;

public class ConditionalStatement1 {
	
	public static void main(String[] args) {
		
		
		
		 //1. simple if statement
		 
		
		boolean haveMoney = false;
		if (haveMoney) {
			System.out.println("I will eat outside");
		
		
		
		}
		
		
		//2. if else statement
		 boolean isRaining = false;
		 
		 if (isRaining) {
			 System.out.println("take the umbrella");
		 }else {
			 System.out.println("Don't take umbrella");
		 }
		System.out.println("--------------------------------");
		 //real time experience
		 boolean buttonIsEnabled = true;
		 if (buttonIsEnabled) {
			 System.out.println("Login Btn is enabled");
			  }else {
				  System.out.println("Login Btn is enabled");
			  }
		 	System.out.println("-----------------------------------");
		 
		 // if else statement. Alex, Malika, Ummar
		 	
		 	String name = "Ummar";
		 	if(name.equals("Alex")) {
		 		System.out.println("User logged in as Alex");
		 	}else if (name.equals("Malika")) {
		 		System.out.println("User logged in as Malika");
		 		
		 	}else if (name.equals("Ummar")) {
		 		System.out.println("User logged inn as Ummar");
		 	}else {
		 		System.err.println("Unkown User");
		 	}
		 // Though it is string it will return true/false 
		 	boolean isJohn= name.equals("John");
		 	System.out.println(isJohn);
	
	}

}
