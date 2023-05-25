package trainingSelenium;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String>myCars=new ArrayList<String>();
		// To assign values
		
		myCars.add("Audi");
		myCars.add("Benz");
		myCars.add("BMW");
		
		// System.out.println(myCars);
		
		
		
		// To find number of values
		
		System.out.println(myCars.size());
		
		// To read value based on index
		
		System.out.println(myCars.get(0));   // Audi
		
		System.out.println(myCars.get(1));   // Benz
		
			
		System.out.println(myCars.get(1));
		System.out.println(myCars.get(2));
     // System.out.println(myCars.get(3));
	
	   // To read values using for -each
		
		for (String myCar : myCars)
		{
			System.out.println(myCar);
			
			// To print horizontally 
			
			System.out.println(myCars);
		}
	
	
	
	
	}
	

}
