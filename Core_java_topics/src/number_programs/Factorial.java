package number_programs;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) {
		int fact = 1; 
		
		// take the number from the user. 
		Scanner sc = new Scanner(System.in);   // import Scanner class from java.util package
		System.out.println("Enter a integer number");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		// print the result outside the for loop. 
		System.out.println("The Factorial of "+ num + " is " + fact);
	}

}
