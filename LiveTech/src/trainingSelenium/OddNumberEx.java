package trainingSelenium;

public class OddNumberEx {

	public static void main(String[] args) {
		// Write program to display odd numbers up to 20
		
		int limit=20;
		System.out.println("Printing Odd Numbers "+limit);
		
		for (int i=1;i<=limit;i++)
		{
          // If the no is not divisible by 2 then it is odd
			if (i%2!=0)
			{
				System.out.println(i +""); // System.out.println (i); System.out.println (i +",");
			}
	}

	}
}
