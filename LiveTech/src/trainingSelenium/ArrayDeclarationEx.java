package trainingSelenium;

public class ArrayDeclarationEx {

	public static void main(String[] args) {
		// Array Declaration
		
		String[]myCars= new String[3];
		
		// To assign values
		
		myCars[0]= "Audi";
		myCars[1]= "Benz";
		myCars[2]= "BMW";
		
		// To find the size of an array
		
		System.out.println("Number of values are: "+myCars.length);
		
		// To read values from array using Index
		
		System.out.println(myCars[0]);
		System.out.println(myCars[1]);
		System.out.println(myCars[2]);
		System.out.println("*******");
		
		// To read values from array using for loop
		
		for(int i=0;i<=myCars.length-1;i++) {
			System.out.println(myCars[i]);
		}
	         System.out.println("******");
		
	
	
	// To read values from array using for each
	
	   for(String myCar : myCars) {
		   System.out.println(myCar);
	   }
		
		

}
}

