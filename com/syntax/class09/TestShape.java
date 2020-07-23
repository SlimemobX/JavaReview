package com.syntax.class09;

public class TestShape {
	
	public static void main(String[] args) {
		
		Square square = new Square(5);
		square.calculateArea();
		square.calculatePerimeter();
		
		
		System.out.println();
		
		Rectangle rectangle = new Rectangle(4,6);
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		
		
		System.out.println();
		
		Shape shape =  new Shape();
		shape.calculateArea();
		shape.calculatePerimeter();
		
		// we cannot change method signature
		// we cannot change return type
		// can we change access modifier ---> YES
		
		// we can increase visibility but cannot decrease it
		// increase ---> private ---> default ---> protected ---> public
		// decrease ---> public ---> protected ---> default ---> private
		
		
		// can we override private methods? no, only accessible inside same class
		
		// can we override static methods? no, static is a keyword which makes the variable or method
		// belongs to a class not to an instance ---> we can re-declare static methods
		
		// can we override Constructors? no
		
		// class implementation method signature
		
		// can we override main method? no---> main method is static
		
		// overridden method? ---> method inside the parent class
		// overriding method? ---> method inside the child class
		
		// an important oops concepts
		// polymorphism- ability of a method or a constructor to have different implementation
	}

}
