package com.syntax.class02;

public class DataTypes {
	
	public static void main(String[] args) {
		
		/*
		 * Data Types
		 * two types of data in java
		 * 1. primitive
		 * 		byte 1 byte. 1 byte = 8 bits
		 * 		short 2 bytes. 2 bytes = 16 bits
		 * 		int 4 bytes. 4 bytes = 32 bits
		 * 		long 8 bytes. 8 bytes = 64 bits
		 * 		float 
		 * 		double
		 * 		char
		 * 		boolean
		 * 2. non-primitive
		 * String, classes, arrays
		 */
		
		// implicitly (Widening)
		int num1 = 3244;
		double dNum = num1;
		System.out.println(dNum);
		
		//explicitly (Narrowing)
		double dNum2 = 99.9;
		int intNum2 = (int) dNum2;
		System.out.println(intNum2);
		
		// Casting Demo
		
		double num = 10.9;
		System.out.println(num);
		
		int num2 = (int) num;
		System.out.println(num2);
		

		
	}

}
