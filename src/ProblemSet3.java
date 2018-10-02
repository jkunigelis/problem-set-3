/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.util.Scanner;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
			ProblemSet3 ps3 = new ProblemSet3();
			System.out.println("Please input number for date.");
			int date = in.nextInt();
			System.out.println("Please input number for you.");
			int you = in.nextInt();
			ps3.dateFashion(date, you);
			in.close();
	}
		
	public void dateFashion(int you, int date) {
		if (date < 0 || you < 0 || date > 10 || you > 10) {
			System.out.println("ERROR NOT VALID");
		}
		else {
			if (date > 7 && you < 3) {
				System.out.println("NO");
			}
			if (you > 7 && date < 3) {
				System.out.println("NO");
			}
			if (date < 3 && you < 3) {
				System.out.println("NO");
			}
			if (date > 7 && you > 7) {
				System.out.println("YES");
			}
			if (you > 2 && you < 8 && date > 2 && date < 8) {
				System.out.println("MAYBE");
			}
		}
	}
	
	public void fizzString(String str) {
		str = in.nextLine();
		char firstLetter;
		char lastLetter;
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		
	}
	
	public void fizzStringAgain(int n) {
		
	}
	
	public void makeBricks(int small, int big, int goal) {
		
	}
	
	public void loneSum(int a, int b, int c) {
		
	}
	
	public void luckySum(int a, int b, int c) {
		
	}
	
	public void factorialWithFor(int n) {
		
	}
	
	public void factorialWithWhile(int n) {
		
	}
	
	public void isPrime(int n) {
		
	}
}