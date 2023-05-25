package oops.concept;

public class MycalSumClass {

	// To perform addition using passing of arguments- removing hard coded/fixed
	// values

	public int sumOf(int a, int b) {

		int c = a + b;
		return (c); 		// This can't be declared @ any other place- i.e outside of this method
		

	}

	public static void main(String[] args) {

		MycalSumClass cs = new MycalSumClass();
		int result = cs.sumOf(30, 40); 		// can't include same line again will show duplicate variable

		System.out.println("Sum of given numbers is: " + result);

	}

}
