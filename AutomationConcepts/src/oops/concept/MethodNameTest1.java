package oops.concept;

public class MethodNameTest1 {
	
	private String str="Welcome to my Tutorial";
	int dev=60;

	public void MethodNameTest1() {
		
		System.out.println("Both method name and classname are the same");
	}
	
	public static void main(String[] args) {
		
		MethodNameTest1 test=new MethodNameTest1();
	   System.out.println(test.str);
	      	test.MethodNameTest1();
	   	 	   

	}

}
