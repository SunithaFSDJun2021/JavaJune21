/**Purpose: Create a calculator class to perform addition, subtraction, multiplication and division of two integers.
 * Get inputs from command line/program arguments.
 */

package Week1Day1;

public class SimpleCalculatorWithCommandLineArguments {

	public static void main(String[] CmdlineArgs) {
		
		int firstNumber, secondNumber;
		
		try {
		firstNumber=Integer.parseInt(CmdlineArgs[0]);
		secondNumber=Integer.parseInt(CmdlineArgs[1]);
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		System.out.println("Result of addition for the two supplied command line arguments is: " + (firstNumber+secondNumber));
		System.out.println("Result of subtraction for the two supplied command line arguments is: " + (firstNumber-secondNumber));
		System.out.println("Result of multiplication for the two supplied command line arguments is: " + (firstNumber*secondNumber));
		System.out.println("Result of division for the two supplied command line arguments is: " + (firstNumber/secondNumber));
		}
		
		  catch (ArrayIndexOutOfBoundsException E) {
		  System.out.println("No command line arguments supplied"); }
		 
		
		  catch (NumberFormatException E) {
		  System.out.println("Please supply only integer values as arguments"); }
		 
		}
	}


