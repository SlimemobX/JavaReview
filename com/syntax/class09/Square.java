package com.syntax.class09;

public class Square extends Shape{
	
	// we created a class and define and implement some methods
	// we created other class ---> square and rectangle ---> and extend them to the first class

	int length;
	public Square(int length) {
		super();
		this.length = length;
	}
	
	
	public void calculateArea() {
		System.out.println("Area of the Square is: " + (length*length));
	}
	
	public void calculatePerimeter() {
		System.out.println("Perimeter of the Square is: " + (4*length) );
	}

}



