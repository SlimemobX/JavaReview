package com.syntax.class09;

public class TestMath extends Math{
	public static void main(String[] args) {
		
//		Math mult = new Math();
//		double product = mult.multiply(15, 3.5);
//		System.out.println(product);
		
		// how can we access multiply method w/o creating an object?
		
		// how can we access multiply method w/o creating an object or w/o using class name?? 
		
		int product = multiply(12,4);
		System.out.println(product);
		
		// can we change access modifiers while overloading? ---> yes
		// can we overload Private methods?
		// can we overload Static methods?
		//can we overload constructors?
	}

}
