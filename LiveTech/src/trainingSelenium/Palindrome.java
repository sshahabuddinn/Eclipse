package trainingSelenium;

public class Palindrome {

	public static void main(String[] args) {
		
		String str1="refer";
		String str2="";
		
		for (int i=str1.length(); i>=0;i++) {
			
			str2=str2+str1.charAt(i);
			}
		
		System.out.println(str2);
		
		// Check given string palindrome
		
		if(str1.equals(str2)) {
			
			System.out.println("It is a palindrome");
			}
		
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}