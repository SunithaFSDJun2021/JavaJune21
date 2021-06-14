/**7. Email Validation. Output is false if the validation fails else true. 
 * String input="test@gmail.com" 
 * 1)@ & . should be present; 
 * 2)@ & . should not be repeated; 
 * 3)there should be four characters between @ and .; 
 * 4)there should be at least 3 characters before @ ; 
 * 5)the end of mail id should be .com; Expected Output=true
 */

package com.practiceexercise.week1.java;

public class CheckForValidEmail {

	public static void main(String[] args) {

		String inputEmail = "test@gmail.com";
		boolean isValidEmail = emailCheck(inputEmail);
		if (isValidEmail == true)
			System.out.println("The Email provided is valid");
		else
			System.out.println("The Email provided is invalid");
	}

	public static boolean emailCheck(String inputEmail) {
		boolean isValidEmail = false;
		if (inputEmail.contains("@") && inputEmail.contains(".")) {
			if (inputEmail.substring(inputEmail.indexOf('.')).equals(".com")) {
				if (inputEmail.chars().filter(ch -> ch == '@').count() == 1) {
					if (inputEmail.substring(inputEmail.indexOf('@') + 1, inputEmail.indexOf('.')).length() >= 4) {
						if (inputEmail.substring(0, inputEmail.indexOf('@')).length() >= 3) {
							return true;
						}
					}
				}
			}
		}
		return isValidEmail;
	}

}
