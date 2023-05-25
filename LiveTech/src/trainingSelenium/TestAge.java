package trainingSelenium;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		
		// To test Age
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter your age");
		 int age=sc.nextInt();
		 
		 if (age<18) {
			 
			 System.out.println("You are minor");
			 System.out.println("Your not eligible to work");
			  }
		 else if (age>=18 && age<=61) {
			 System.out.println("Your are eligible to work");
		 }
		 else {
			 System.out.println("Your too old to work as per Govt rules");
		 }

	}

}
