package trainingSelenium;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCollectionsEx {

	public static void main(String[] args) {
		
	ArrayList<String>myCars=new ArrayList<String>();
	
	// To assign values
	
	  myCars.add("Audi");
	  myCars.add("Benz");
	  myCars.add("BMW");
	  
	  System.out.println(myCars);    // [Audi,Benz,BMW]
	  
	  // To change value "Audi" to "XUV300"
	  
	  myCars.set(0, "XUV300");
	  
	  System.out.println(myCars);    // [XUV300,Benz,BMW]
	  
	  // To sort values
	  
	  Collections.sort(myCars);   
	  System.out.println(myCars);   // [BMW,Benz,XUV300]
	  
	  System.out.println(myCars.size());    //3
	  
	  // To remove value
	  
	  myCars.remove(2);
	  System.out.println(myCars.size());   //2
	  
	  // To clear the values
	  
	  myCars.clear();
	  System.out.println(myCars.size());  // 0
	  
	  
	}

}
