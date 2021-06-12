/**
 * Find the sum of maximum and minimum number from a given input array Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
 */
package com.practiceexercise.week1.java;

public class SumOfMaxMinInGivenArray {

	public static void main(String[] args) {

		int[] inputArray = { 19,12,31 };
		int min = inputArray[0], max = inputArray[0], sum = 0, i = 0;

		for (i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > max) {
				max = inputArray[i];
			}
			if (inputArray[i] < min) {
				min = inputArray[i];
			}

		}

		sum = (max + min);
		System.out.println("Maximum number in given array is" + " " + max);
		System.out.println("Minimum number in given array is" + " " + min);
		System.out.println("Sum of Maximum and Minimum number in the given array is:" + " " + sum);

	}

}
