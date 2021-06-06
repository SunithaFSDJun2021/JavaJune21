package Week1Day1;

public class SimpleCalculatorWithCommandLineArguments {

	public static void main(String[] args) {
		
		int a,b;
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Result of addition for the two supplied command line arguments is: " + (a+b));
		System.out.println("Result of subtraction for the two supplied command line arguments is: " + (a-b));
		System.out.println("Result of multiplication for the two supplied command line arguments is: " + (a*b));
		System.out.println("Result of division for the two supplied command line arguments is: " + (a/b));

	}

}
