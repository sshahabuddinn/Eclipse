package trainingSelenium;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		// Write program for multiplication from 1 to 10
		// to read user input
		
	Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	   int n=sc.nextInt();
	   sc.close();
	   
	   // to print table upto 10
	   
	   for (int i=1;i<=10;i++)
	   {
		   // 5*1-5
		   
		   System.out.println(n       + " * "      +i      +" = "            +(n*i));
	   }

	}

}
