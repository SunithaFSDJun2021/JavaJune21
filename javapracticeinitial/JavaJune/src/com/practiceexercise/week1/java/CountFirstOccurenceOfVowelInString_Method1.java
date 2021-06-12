/**Exercise 2: Find the number of vowels in a given string
 * Input1: ”NewyorkE” 'e' or 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case*/

package com.practiceexercise.week1.java;

public class CountFirstOccurenceOfVowelInString_Method1 {
	
	

	public static void main(String[] args) {
		String inputString = "NewyorkE";
		
		int vowel_aOrA =0, vowel_eOrE =0, vowel_iOrI =0, vowel_oOrO =0, vowel_uOrU = 0;
		int countOfVowels = 0;
		
		for (int i=0; i<inputString.length(); i++) {
		//System.out.println(inputString.charAt(i));
		
		switch (inputString.charAt(i)) {
		
		case 'a':
		case 'A':
			vowel_aOrA = 1;
			break;		
								
		case 'e':
		case 'E':
			vowel_eOrE = 1;
			break;
			
			
		case 'i':	
		case 'I':
			vowel_iOrI = 1;
			break;
				
		case 'o':
		case 'O':
			vowel_oOrO = 1;
			break;
			
		case 'u':
		case 'U':
			
			vowel_uOrU = 1;
			break;
			
		}
		
				
	}
		countOfVowels = vowel_aOrA + vowel_eOrE + vowel_iOrI +vowel_oOrO + vowel_uOrU;
		System.out.println("Total number of distinct vowels in the given String are " + " " + countOfVowels);
		
	}

}
