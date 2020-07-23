package com.syntax.class09;

public class Rectangle extends Shape{
	
	int length, width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
	public void calculateArea() {
		System.out.println("Area of the Recrtangle is: " + (length*width));
	}
	
	public void calculatePerimeter() {
		System.out.println("Perimeter of the Square is: " + 2*(length*width) );
	}
}
