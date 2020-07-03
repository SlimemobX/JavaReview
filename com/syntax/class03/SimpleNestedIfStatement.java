package com.syntax.class03;

public class SimpleNestedIfStatement {
	public static void main(String[] args) {
		
		boolean haveMoney = true;
		
		boolean resturantIsNear = false;
		
		if (haveMoney) {
			System.out.println("I have money");
			if (resturantIsNear) { 
				System.out.println("I go to the resturant");
			}
		}
	

	}

}
