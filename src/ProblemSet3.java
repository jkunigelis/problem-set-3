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
			
			//ex 1
			
			System.out.println("Exercise 1");
			System.out.println("Please input number for date.");
			int date = in.nextInt();
			System.out.println("Please input number for you.");
			int you = in.nextInt();
			ps3.dateFashion(date, you);
			
			//ex 2
			System.out.println("Exercise 2");
			System.out.println("Please input word.");
		    String str = in.next();
			ps3.fizzString(str);
			
			//ex 3
			System.out.println("Exercise 3");
			System.out.println("Please input temperature.");
			int temp = in.nextInt();
			System.out.println("Is it summer?");
			boolean isSummer = in.nextBoolean();
			ps3.squirrelPlay(temp, isSummer);
			
			//ex 4 
			System.out.println("Exercise 4");
			System.out.println("Please input number");
			int n = in.nextInt();
			ps3.fizzStringAgain(n);
			
			//ex 5
			System.out.println("Exercise 5");
			System.out.println("Please input goal inches.");
			int goal = in.nextInt();
			System.out.println("Please input amount of small bricks.");
			int small = in.nextInt();
			System.out.println("Please input amount of big bricks");
			int big = in.nextInt();
			ps3.makeBricks(small, big, goal);  
			
			//ex 6
			System.out.println("Exercise 6");
			System.out.println("Please input a number.");
			int a = in.nextInt();
			System.out.println("Please input a number.");
			int b = in.nextInt();
			System.out.println("Please input a number.");
			int c = in.nextInt();
			ps3.loneSum(a, b, c); 
			
			//ex 7
			System.out.println("Exercise 7");
			System.out.println("Please input a number.");
			int a = in.nextInt();
			System.out.println("Please input a number.");
			int b = in.nextInt();
			System.out.println("Please input a number.");
			int c = in.nextInt();
			ps3.luckySum(a, b, c); 
			
			//ex 8
			System.out.println("Exercise 8");
			System.out.println("Please input a number.");
			int n = in.nextInt();
			ps3.factorialWithFor(n); 
			
			//ex 9
			System.out.println("Exercise 9");
			System.out.println("Please input a number.");
			int n = in.nextInt();
			ps3.factorialWithWhile(n);
			
			//ex 9
			System.out.println("Exercise 10");
			System.out.println("Please input a number.");
			int n = in.nextInt();
			ps3.isPrime(n);
			
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
		int inches = (small*1) + (big*5);
		if (inches >= goal) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a == b && a == c) {
			System.out.println(a);
		}
		if (a == b && a != c) {
			System.out.println(a + c);
		}
		if (a == c && a != b) {
			System.out.println(a + b);
		}
		if (b == c && b != a) {
			System.out.println(a + b);
		}
		if (a != b && b != c && a != c) {
		    System.out.println(a + b + c);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if (a == 13 || b == 13 || c == 13) {
		    
		    // if all 13
		    if (a == 13 && b == 13 && c == 13) {
		        System.out.println("0");
		    }
		    
		    //if a and b are 13
		    if (a == 13 && b == a && a != c) {
		        System.out.println("0");
		    }
		    
		    //if b and c are 13
		    if (b == 13 && b != a && b == c) {
		        System.out.println(a);
		    }
		    
		    //if a and c are 13
		    if (a == 13 && b != a && a == c) {
		        System.out.println("0");
		    }
		    
		    //if none are same but one is 13
		    if ((a == 13 && b != 13 && c != 13) || (b == 13 && a != 13 && c != 13) || (c == 13 && b != 13 && a != 13)) {
		        if (a == 13) {
    		        System.out.println("0");
    		    }
    		    if (b == 13) {
    		        System.out.println(a);
    		    }
    		    if (c == 13) {
    		        System.out.println(a + b);
    		    }
		    }
		}
		else {
		    System.out.println(a + b + c);
		}
	}
	
	public void factorialWithFor(int n) {
	    //keep original number
	    int nOriginal = n;
	    //(example of 5) set i to 5 and while i is greater than 0 then keep decreasing i
		for (int i = n; i > 0; i--) {
		    //if its the first instance
		    if (i == n) {
		        //just itself
		        n = n * 1;
		    }
		    //otherwise just multiply by 4, then 3, etc.
		    else {
		        n = n * i;
		    }
		}
		System.out.println(nOriginal + "! = " + n);
	}
	
	public void factorialWithWhile(int n) {
	    int nOriginal = n;
		int i = n;
		while (i > 0) {
		    if (i == n) {
		        n = n * 1;
		        i--;
		    }
		    else {
		        n = n * i;
		        i--;
		    }
		}
		System.out.println(nOriginal + "! = " + n);
	}
	
	public void isPrime(int n) {
	    boolean prime = false;
		int nOriginal = n;
		int i = n;
		//tried using same code as before and i think it worked..
		while (i > 0) {
		    if (i == n) {
		        n = nOriginal * 1;
		        i--;
		    }
		    else {
		        n = nOriginal % i;
		        i--;
		            if (n == 0) {
		                prime = true;
		            }
		    }
		}
		if (prime == true) {
		    System.out.println(nOriginal + " is not prime.");
		}
		if (prime == false) {
		    System.out.println(nOriginal + " is prime.");
		}
	}
}
