
public class ReverseString {

	public static void main(String[] args) {
		
		String str="Ayesha";
		String z="*";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			z=z+str.charAt(i);
			
			System.out.println(z);
			
			}
		
		
		if(str==z) {
			System.out.println("It is not reverse");
			
		}
		
	}
}