package trainingSelenium;

public class Occurance {

	public static void main(String[] args) {
		
		String str="LiveTech";
		int occ=0;
		 
		for (int i=0; i<=str.length()-1; i++)
		{
			if (str.charAt(i)=='e')
				
				{
						occ++;
				
		System.out.println("index of e is: "+i);

	}
		}
	   
	System.out.println("Number of time e occurance in a given string is: "+occ);
    
	}

}

