package com.syntax.class07;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {5,9,6,2,1};
		
		// I don't need to create a instance because it is a static method
		// ArrayManipulation a = new ArrayManipulation();
		
		
		
		int biggest = ArrayManipulation.largest(arr);
		System.out.println("largest is: " + biggest);
		
		ArrayManipulation.printSum(arr);
		
		// int result = ArrayManipulation.sum(arr);
		System.out.println("The sum is: " + ArrayManipulation.sum(arr));
	
	
		ArrayManipulation.printArray(arr);
		
		int[] arr1 = {5,2,6,9,1};
		int[] arr2 = {6,2,4,7,1};
		int[] arr3 = {1,0,2,8,3};
		
		ArrayManipulation.printArray(arr1);
		ArrayManipulation.printArray(arr2);
		ArrayManipulation.printArray(arr3);

		
		
		
		
//		This is to print arr1
//		for (int element: arr1) {
//			System.out.println(element + " ");
//		}
//		
//		This is to print arr2
//		for (int element: arr2) {
//			System.out.println(element + " ");
//		}
//		
//		This is to print arr3
//		for (int element: arr3) {
//			System.out.println(element + " ");
//		}
	
	
	
	
	}
}
