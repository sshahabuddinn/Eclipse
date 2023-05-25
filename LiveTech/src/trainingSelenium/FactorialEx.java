package trainingSelenium;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		// Write program to find factorial for a given number
		
		// to read user input
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number");
		
		int number=sc.nextInt();
		sc.close();
		
		// to factorial
		
		int fact=1;
		
		for (int i=1;i<=number;i++)
		{
			fact=fact*i;
			
			System.out.println("Factorial of "+fact);
		}

	}

}




