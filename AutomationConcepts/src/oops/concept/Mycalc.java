package oops.concept;

public class Mycalc {
	
	 int result;
	 
	 // To perform addition
	public void sumOf() {
		
		int a=10;
		int b=20;
		result= a+b;
		System.out.println("Sum of the two numbers: "+result);
		
	}

	// To perform multiplication
	public void multiOf() {
		
		System.out.println(result);
		
		int a=8;
		int b=7;
		result=a*b;
		System.out.println("Multiplication of two numbers are: "+result);
	}
	public static void main(String[] args) {
		
		// To create instance object for class
		 //NonStaticMethod gl=new NonStaticMethod();     // where NonStaticMethod is the className & gl is the instance object
		
		Mycalc gl=new Mycalc();
		// to call non-static methods
		
		gl.sumOf();
		gl.multiOf();

	}

}
