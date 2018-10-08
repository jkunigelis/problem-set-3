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
			System.out.println("Please input word.");
		    String str = in.next();
			ps3.fizzString(str);
<<<<<<< HEAD
			System.out.println("Please input temperature.");
			int temp = in.nextInt();
			System.out.println("Is it summer?");
			boolean isSummer = in.nextBoolean();
			ps3.squirrelPlay(temp, isSummer);
			System.out.println("Please input number");
			int n = in.nextInt();
			ps3.fizzStringAgain(n);
=======
>>>>>>> 0095212a0606bcdb5bafbce4809ff77621fdda6e
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
			if (you < 3 && date > 2 && date < 8 || date < 3 && you > 2 && you < 8) {
			    System.out.println("NO");
			}
			if (you > 7 && date > 2 && date < 8 || date > 7 && you > 2 && you < 8) {
			    System.out.println("MAYBE");
			}
		}
	}
	
	public void fizzString(String str) {
	   int length1 = str.length();
	   String firstLetter = str.substring(0,1);
	   String lastLetter = str.substring((length1 - 1));
	   if ((firstLetter.equals("f") || firstLetter.equals("F")) && (lastLetter.equals("b") || lastLetter.equals("B"))) {
	       System.out.println("FIZZBUZZ");
	   }
	   else {
    	   if (lastLetter.equals("b") || lastLetter.equals("B")) {
    	        System.out.println("BUZZ");
    	   }
    	   else {
    	       if (firstLetter.equals("f") || firstLetter.equals("F")) {
        	       System.out.println("FIZZ");
        	   }
        	   else {
        	       System.out.println(str);
    	       }
    	   }
	   }
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true) {
		    if (temp >= 60 && temp <= 100) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
		else {
		    if (temp >= 60 && temp <= 90) {
		    	System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
	public void fizzStringAgain(int n) {
		if (((n % 3) == 0) && ((n % 5) == 0)) {
			System.out.println("FIZZBUZZ");
		}
		else {
			if ((n % 3) == 0) {
				System.out.println("FIZZ");
			}
			else {
				if ((n % 5) == 0) {
					System.out.println("BUZZ");
				}
				else {
					System.out.println(n + "!");
				}
			}
		}
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
