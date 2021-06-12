package com.practiceexercise.week1.java;

public class CountFirstOccurrenceofVowelsInString_Method2 {

	public static void main(String[] args) {
		
		String inputString = "Newyork E *&% 123 aAeEiIoOuU";
		
		String[] vowels = {"A", "E", "I", "O", "U"};
		
		int countOfVowels = 0;

		for(String eachVowel: vowels) {
			//System.out.println(eachVowel);
			for (char eachChar_InputStr : inputString.toUpperCase().toCharArray()) {
				//System.out.println(eachChar_InputStr);
				if(eachChar_InputStr == eachVowel.charAt(0)) {
					countOfVowels++;
					break;
				}
			}	
		}
		
		System.out.println("Total number of distinct vowels in the given String are " + " " + countOfVowels);	
	}
	

}


