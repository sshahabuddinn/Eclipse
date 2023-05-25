package oops.concept;

public class StaticMethod {
	
	static int result;

	 // To perform addition
	public static void sumOf() {
			int a=10;
			int b=20;
			result=a+b;
			
			System.out.println("Sum of the two numbers are: "+result);
		
	}
	
	// To perform Multiplication
	public static void multiOf() {
		
		   int a= 4;
		   int b= 6;
		   result= a*b;
		   
		   System.out.println("Multiplication of two numbers are: "+result);
	}
	
	
	
	public static void main(String[] args) {
		
		sumOf();
		multiOf();
		

	}

}
