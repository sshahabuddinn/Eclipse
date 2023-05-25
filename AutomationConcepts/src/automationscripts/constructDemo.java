

package automationscripts;

public class constructDemo {
// Default 
	
	public constructDemo() 
	
	{ System.out.println(" I am in the constructor"); 
	System.out.println(" I am in the constructor lecture 1"); 
	 } 
	// Parameterized constructor 
	
	public constructDemo(int a, int b) 
	{ System.out.println(" I am in the parameterized constructor"); 
	int c=a+b; 
	
	System.out.println(c); 
	} 
	
	public constructDemo(String str) 
	{ System.out.println(str); } 
	
	public void getdata() { 
		System.out.println("I am the method"); 
		} //will not return values //name of constructor should be the class name
	

	public static void main(String[] args) {  
		
		new constructDemo(); 
		new constructDemo("hello"); 
		new constructDemo(4,5);
	}

}
