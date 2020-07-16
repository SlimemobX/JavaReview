package com.syntax.class08;

public class MathDemo {
	public static void main(String[] args) {
	int result = 0;
		
		
		result = Math.add(4,7);
		System.out.println("addition result: " + result);
		
		
		result = Math.multiply(4,6);
		System.out.println("Multiplication result: " + result);
		
		
		 result = Math.subtract(6,10);
		 System.out.println("Subtraction result: " + result);
		
		//This method can not be accessed from outside of class
		// result = divide(9,3);
		// System.out.println("Division result: " + result);
		 
		 System.out.println("---Now let's test variables---");
	 		// First I have to create an object/instance
	 		Math m = new Math();
	 		m.name = "Math";
	 		m.phone = "(123) 456-7890";
	 		m.address = "Virginia, USA";
	 		// this variable cannot be accessed
	 		// because it is private
	 		// m.SSN = 123678907;
	}
}
