package com.syntax.class07;

public class ArrayManipulation {
	public static int largest(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	// this method will not return the sum
	public static void printSum(int[] array2) {
		int total = sum(array2);
		System.out.println(total);
	}

	// will return sum
	public static int sum(int[] array2) {
		int total = 0;

		for (int element : array2) {
			total += element;
		}
		return total;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
