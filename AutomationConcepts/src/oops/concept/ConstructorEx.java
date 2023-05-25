package oops.concept;

// Create a class for Constructor Overloading
public class ConstructorEx {

	public ConstructorEx() {

		System.out.println("My first constructor");
	}

	
	  public ConstructorEx(int a, String abc) { 
		  
		  System.out.println("My second constructor"); 
		  
	  }
	 

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		ConstructorEx cons= new ConstructorEx(10,"hello");
		@SuppressWarnings("unused")
		ConstructorEx cons1 = new ConstructorEx();
		
		

	}

}
