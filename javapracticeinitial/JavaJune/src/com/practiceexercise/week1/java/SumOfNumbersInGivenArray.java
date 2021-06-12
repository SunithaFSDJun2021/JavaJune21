/**5. Find the sum of the numbers in the given input string array Input:{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1) 
 * Note in the above array 12 must not considered as such it must be considered as 1,2
 * */

package com.practiceexercise.week1.java;

public class SumOfNumbersInGivenArray {

	public static void main(String[] args) {

		String[] inputArray = { "2AA", "12", "ABC", "c1a" };
		int sum = calcSum(inputArray);
		System.out.println("The sum of numbers in the given input array is  " + sum);

	}

	public static int calcSum(String[] inputArray) {

		int sum = 0;
		for (String subArray : inputArray) {
			char[] charArray = subArray.toCharArray();
			for (char eachChar : charArray) {
				if (Character.isDigit(eachChar))
					sum = sum + Character.getNumericValue(eachChar);
			}
		}

		return sum;
	}
}
