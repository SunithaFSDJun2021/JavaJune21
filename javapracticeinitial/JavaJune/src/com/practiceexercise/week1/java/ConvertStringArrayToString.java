/**6. Convert String array to String String[] input1=["Vikas","Lokesh",Ashok] Expected output String: "Vikas,Lokesh,Ashok"*/

package com.practiceexercise.week1.java;

public class ConvertStringArrayToString {

	public static void main(String[] args) {
		
				String[] inputArray = { "Vikas", "Lokesh", "Ashok" };
				String outputString= "";
				int i = 0; 
				int len = inputArray.length;
				
				for (String eachString : inputArray) {
					
					if (i==len-1) {
						outputString = outputString + eachString;
					}else {
						outputString = outputString + eachString +",";
						i++;
					}
					
				}
				System.out.println("\""+outputString+"\"");
			}
	}

	