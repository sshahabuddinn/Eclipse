package trainingSelenium;

public class EvenNumberEx {

	public static void main(String[] args) {
		// Write program to display Even numbers up to 20

		int limit=20;
		System.out.println("Printing even numbers 1 to "+limit);
		
		for (int i=1;i<=limit;i++)
		{
		// If number is divisible by 2 then it is even
			
			if ((i%2)==0){
				System.out.println(i +"");  // System.out.println(i); System.out.println(i +",");
				
			}
		}

	}

}
