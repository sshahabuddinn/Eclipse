package trainingSelenium;

public class NestedEx {

	public static void main(String[] args) {
		
		// To perform Nested if program using 3 values
		
		int a=30;
		int b=20;
		int c=10;
		
				
		if ((a<b) && (a<c)){
			
			System.out.println("smaller value is: "+a);
		}
		
		else if (b<c) {
			
			System.out.println("smaller value is "+b);
		}
		
		else {
			
			System.out.println("smaller value is: "+c);
		}

	}

}
