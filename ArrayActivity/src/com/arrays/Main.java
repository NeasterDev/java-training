package com.arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {23, 56, 0.15, 73, 2, -5, 902, 1999, 20};
		System.out.print("Min value: ");
		System.out.println(minValue(arr));
		System.out.print("Max value: ");
		System.out.println(maxValue(arr));
		System.out.print("Odd index values: ");
		printOddValues(arr);
		System.out.print("Even index values: ");
		printEvenValues(arr);
		System.out.print("Sort ascending: ");
		sortAscending(arr);
		System.out.print("Sort descending: ");
		sortDescending(arr);

	}
	
	public static double minValue(double[] arr) {
		double min = 0.0;
		
		// loop through array
		for (int i = 0; i < arr.length; i++) {
			double currentVal = arr[i];
			// if the currentVal is 0 set the first value to min
			if (currentVal == 0) {
				min = currentVal;
			// else if the currentVal is smaller than min, set min to currentVal
			} else if (currentVal < min) {
				min = currentVal;
			}
		}
		// return the minimum value of the array
		return min;
	}
	
	public static double maxValue(double[] arr) {
		double max = 0.0;
		
		// loop through array
		for (int i = 0; i < arr.length; i++) {
			double currentVal = arr[i];
			// if the currentVal is 0 set the first value to max
			if (currentVal == 0) {
				max = currentVal;
			// else if the currentVal is larger than max, set max to currentVal
			} else if (currentVal > max) {
				max = currentVal;
			}
		}
		return max;
	}
	
	public static void sortAscending(double[] arr) {
		// sort the array in ascending order
		Arrays.sort(arr);
		// loop through the array and print out each value
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		// add a newline at the end for readability
		System.out.println();
	}
	
	public static void sortDescending(double[] arr) {
		// inverse the sign of each value in the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
		
		// sort the inverted array
		Arrays.sort(arr);
		
		// inverse the sign of each value again to get original array values
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
			System.out.print(arr[i] + ", ");
		}
		// add a newline at the end for readability
		System.out.println();
	}
	
	public static void printOddValues(double[] arr) {
		// loop through the array
		for (int i = 0; i < arr.length; i++) {
			double currentVal = arr[i];
			// check if value can be divided evenly by 2, if it cannot it must be odd
			if (i % 2 != 0) {
				// print odd value
				System.out.print(currentVal + ", ");
			}
		}
		// add a newline at the end for readability
		System.out.println();
	}
	
	public static void printEvenValues(double[] arr) {
		// loop through the array
		for (int i = 0; i < arr.length; i++) {
			double currentVal = arr[i];
			// check if value can be divided evenly by 2, if it can it must be even
			if (i % 2 == 0) {
				// print odd value
				System.out.print(currentVal + ", ");
			}
		}
		// add a newline at the end for readability
		System.out.println();
	}
	
	

}
