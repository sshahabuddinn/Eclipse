package trainingSelenium;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// Write program to display prime numbers between 1 to 20
		
		  int cnt;
		  System.out.println("Printing numbers 1 to 20");
		  
		  // loop through the numbers one by one
		  
		 for (int n=1;n<=20;n++)
		 {
			 cnt=0;
		// to check if the number is prime
			 for (int i=1;i<=n;i++)
			 {
				 if (n%i==0) {
					 cnt++;
				 }
			 }
			 
			 if (cnt==2)
			 {
				 System.out.println(n); // System.out.println(n +",")
			 }
		 }

	}

}
