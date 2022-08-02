package com.NicholasEaster.handson3;

public class HandsOn {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// get input for the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter integer: ");
			arr[i] = StudentHelper.ReadInputInt();
		}
		
		// print out contents of array
		System.out.println("In order");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		
		// print out contents of array in reverse
		System.out.println("\nReverse order");
		for (int i = arr.length - 1; i >= 0; i--) {
			
			System.out.print(arr[i] + " ");
		}
		
		// print the values of the array where the index is odd
		System.out.println("\nOdd index values");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				
				System.out.println(arr[i] + " at index " + i);
			}
		}

	}

}
