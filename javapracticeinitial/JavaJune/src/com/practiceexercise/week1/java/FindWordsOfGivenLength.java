/**4. Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2
Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
*/

package com.practiceexercise.week1.java;

public class FindWordsOfGivenLength {

	public static void main(String[] args) {

		String[] inputArray = { "aa", "b", "cc", "ddd" };

		getNumberOfWords(inputArray, 2);
		getNumberOfWords(inputArray, 1);
		getNumberOfWords(inputArray, 3);

	}

	public static void getNumberOfWords(String[] inputArray, int reqLength) {

		int countOfWords = 0;

		for (String subStr : inputArray) {

			if (subStr.length() == reqLength)
				countOfWords++;
			
		}
		System.out.println("Number of words of given length (" + reqLength + " ) in the array provided are  " + countOfWords);
	
	}
}
