package oops.concept;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		
		// Exception Handling Example
		
		try { 
		
		int a=10;
		 int b=0;
		 int c=a/b;
		 System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("b- value should not be zero" );
			System.out.println(e);
		}
		finally {
			System.out.println("Demo for Exceptional Handling");
		}

}
}
