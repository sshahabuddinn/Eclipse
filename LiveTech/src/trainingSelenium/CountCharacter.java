package trainingSelenium;

public class CountCharacter {

	public static void main(String[] args) {
		
		String str= "MadhukarQAIT";
		int count=0;
				System.out.println("Number of characters: "+str);
		
		//Counts each character except space    
		for(int i=0; i<=str.length();i++) {
			
			if (str.charAt(i)!=' ')
				count++;
			
			//Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
				
			
		}
		

	}

}
