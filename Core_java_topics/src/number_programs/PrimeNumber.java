package number_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
        int result = 1;
		// take the number from the user. 
		Scanner sc = new Scanner(System.in);   // import Scanner class from java.util package
		System.out.println("Enter a integer number");
		int num = sc.nextInt();
		
		for (int i = 2; i< num; i++)
		{
			if(num % i == 0)
			{
				result = 0; 
				break;
			}
		}
		
		if(result == 1)
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num +" is not a prime number");
		}
	}
}
