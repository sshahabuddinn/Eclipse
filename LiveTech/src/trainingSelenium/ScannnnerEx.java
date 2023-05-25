package trainingSelenium;

import java.util.Scanner;

public class ScannnnerEx {

	public static void main(String[] args) {
		
		// Create object for Scanner Class
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String myName=sc.nextLine();
		
		System.out.println("Enter no of days to get job");
		int myDays=sc.nextInt();
		
		System.out.println("Entered name is: "+myName);
		System.out.println("No of days required are:"+myDays);
		
	}
	
}