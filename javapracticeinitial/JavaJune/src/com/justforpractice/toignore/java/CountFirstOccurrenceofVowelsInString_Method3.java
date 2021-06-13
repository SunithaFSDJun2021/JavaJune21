package com.justforpractice.toignore.java;

public class CountFirstOccurrenceofVowelsInString_Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="NeeeeewyorkE";
		String lowCaseInput;
		lowCaseInput=input1.toLowerCase();
		System.out.println(lowCaseInput);
		
		int len=lowCaseInput.length();
		System.out.println(len);
		int i;
		int j;
		int count=0;
		boolean[] duplicateflag = {false,false,false,false,false};
		char[] vowels = {'a','e','i','o','u'};
	
		for(i=0;i<len;i++) {
			char val = (lowCaseInput.charAt(i));
			System.out.println(val);
			for(j=0;j<vowels.length;j++)
				
				if (val==vowels[j] && duplicateflag[j]==false) {
					count++;
					duplicateflag[j]=true;
			}			
		}
		System.out.println("The count of vowels from the string:"+"'"+ input1 + "'"+ " after removing duplicates are: "+ count);		
	}
	}


