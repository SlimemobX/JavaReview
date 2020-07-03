package com.syntax.class03;

public class NestedIfStatementDemo {
	public static void main(String[] args) {
		
		int age = 5;
		
		if (age == 5) {
			System.out.println("You are 5 years old");
		}else if (age == 6) {
			System.out.println("You are 6 years old");
		}
		
		System.out.println("-----------------------------");
	
		boolean checkBoxIsDisplayed = true;
		boolean checkBoxIsSelected = true;
		
		if (checkBoxIsDisplayed) {
			System.out.println("Check box is displyed");
		
			if(checkBoxIsSelected) {
				System.out.println("Check box is selected");
			}else {
				System.out.println("Click on checkbox");
			}
		
		}else {
			System.err.println("Check box is not displayed");
		}
		
		
		
		
		
		
		
	}

}
