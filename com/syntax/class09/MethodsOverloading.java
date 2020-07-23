package com.syntax.class09;

public class MethodsOverloading {
	
	// polymorphism ---> having more than one form or shape
	// for java ---> ability to implement a method in different ways
	
	// static bonding ---> compile time polymorphism ---> method overloading
	
	// diferent implementation of a method or constructor inside the same class
	
	
	// 1. change the type of parameter
	// 2. change the number of parameter
	// 3. change the order of parameters
	
	
	public void method() {
		System.out.println("I am a method without any parameter");

	}
	
	public void method(String str) {
		System.out.println("I am a method with a String parameter");

	}
	
	public void method(int i) {
		System.out.println("I am a method with a int parameter");

	}
	
	public void method(String str, int i) {
		System.out.println("I am a method with one String and one int parameter");

	}
	
	public void method(int i, String str) {
		System.out.println("I am a method with one int and one String parameter");

	}
	
	public void method(String str1, String str2) {
		System.out.println("I am a method with two String parameter");

	}
	
	
	// we cannot overload a method by changing 
//	public void method(String str2, String str1) {
//		System.out.println("I am a method with two String parameter");
//
//	}

}
