package trainingSelenium;

public class FibonacciEx {

	public static void main(String[] args) {
		// Write program to display fibonacci series of numbers upto 100

		
		 int a=0;
		 int b=1;
		 System.out.println(a);
		 System.out.println(b);
		 int c=a+b;
		 
		while (c<=100)
		 {
			 System.out.println(c);
			 
			 // Swap the values
			 
			 a=b;
			 b=c;
			 c=a+b;
		 }
	}

}
