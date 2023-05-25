package oops.concept;

public class SumClass {
	
	public void sumOf(int a,int b) {
		
		int c=a+b;
		System.out.println("Sum of given numbers: "+c);
		
	}

	public static void main(String[] args) {
		
		
		
		SumClass sc=new SumClass();
		sc.sumOf(10, 20);
		sc.sumOf(30, 40);
		
		

	}

}
