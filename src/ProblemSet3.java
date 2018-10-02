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
import java.util.Random;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
			
	}
		
	public void dateFashion(int you, int date) {
		Random rand = new Random();
		date = rand.nextInt(10) + 1;
		you = rand.nextInt(10) + 1;
		if (date > 7 && you < 2) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("NO");
		}
		if (you > 7 && date < 2) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("NO");
		}
		if (you > 7 && date > 2) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("YES");
		}
		if (date > 7 && you > 2) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("YES");
		}
		if (date < 2 && you < 2) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("NO");
		}
		if (date > 7 && you > 7) {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("YES");
		}
		else {
			System.out.println("Date is " + date + " and you are " + you);
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		
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