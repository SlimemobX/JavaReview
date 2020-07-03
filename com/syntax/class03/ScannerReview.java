package com.syntax.class03;

import java.util.Scanner;

public class ScannerReview {
	public static void main(String[] args) {
		
		
		System.out.println("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		
		String firstName = scan.nextLine(); // will execute all characters including white spaces
		System.out.println("Your first name is: " + firstName);
		
		System.out.println("Please enter your last name: ");
		String lastName = scan.next(); // will execute all characters except white spaces
		System.out.println("Your last name is: " + lastName);
		
		
		
		
		
		
	}

}

