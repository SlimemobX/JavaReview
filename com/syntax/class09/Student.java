package com.syntax.class09;

public class Student extends School{
	
	String stuID;
	
	public Student(String name, String lastName, String stuID) {
		super(name, lastName); // we invoke super class constructor
		this.stuID = stuID;
	}
	
	void study() {
		System.out.println(name + " " + lastName + "Student Id is: " + stuID);
	}

	
	
	// parent ----> School class
	// child -----> Student class
	
	// can we overload a method?
	// overloading ---> different implementation of a method inside the same class
	// overriding ---> different implementation of a method inside a different class

	// 1. we define and implement a method inside a class
	// 2. Create another class and extend it to the first class
	// 3. implement the method that created inside the parent in different way
	// 4. Arguments must stay same --> method signature must stay same
	
}



