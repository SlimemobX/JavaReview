package com.syntax.class03;

public class LogicalOperator {
	public static void main(String[] args) {
		
		boolean haveMoney = true;
		boolean resturantIsNear = false;
				;
		
		if(haveMoney && resturantIsNear) {
			System.out.println("I will eat outside");
		}else {
			System.out.println("Both conditions were not true");
		}
		
		System.out.println("---------------------------");
		
		System.out.println("                           ");
		
		boolean atmIsOpen = false;
		boolean cashierIsOpen = false;
		
		if(atmIsOpen || cashierIsOpen) {
			System.out.println("I can get cash");
		}else {
			System.out.println("Neither one was true");
		}
		
		
		System.out.println("---------------------------");
		
		System.out.println("                           ");
		
		int num1 = 3;
		int num2 = 5;
		
		// String statement = "The total of num1 and num2 is: ";
		System.out.println("The sum is: " + (num1 + num2));
		
		
		
	}

}
