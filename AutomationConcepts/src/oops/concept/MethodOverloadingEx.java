package oops.concept;

public class MethodOverloadingEx {

	
	public void melOv(int b, String a) {
		System.out.println("This is method-1");
	}
	
	public void melOv(int a) {
		System.out.println("This is method-2");
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloadingEx mel=new MethodOverloadingEx();
		mel.melOv(20, "hello");
		mel.melOv(10);
		
		

	}

}
