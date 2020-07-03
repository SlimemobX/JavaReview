package com.syntax.class03;

import java.util.Scanner;

public class ScannerReview2 {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your age");
		Scanner scanner = new Scanner(System.in);
		
		
		
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("You can drive in the US");
		}else {
			System.out.println("You need to grow up");
		}
		
		
	
	
	
	
	}
	

}
