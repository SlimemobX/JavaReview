package com.syntax.class03;

import java.util.Scanner;

public class ScannerWithNestedIf {
	
	public static void main(String[] args) {
		
		System.out.println("Is the button displayed?");
		Scanner scan = new Scanner(System.in);
		
		boolean isDisplayed = scan.nextBoolean();
		
				
		if (isDisplayed) {
		
		System.out.println("Is the checkbox selected");
		boolean isSelected = scan.nextBoolean();
				
		System.out.println("Check box is displyed");
		
		if(isSelected) {
				System.out.println("Check box is already selected");
			}else {
				System.out.println("It is not select, youy can click on it");
			}
		
		}else {
			System.err.println("Check box is not displayed");
		}
		
		
		
	}

}
