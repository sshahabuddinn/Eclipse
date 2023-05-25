package oops.concept;

public class ChildClassEx extends ParentClassEx{

	
		public void parentEx() {     // Just add pass arguments as int a to display value of Parent class
			
			System.out.println(" This is child class");
		//	super.parentEx();
		}

		
		public static void main(String[] args) {
			
			ChildClassEx chd=new ChildClassEx();
			chd.sumOf();
			chd.parentEx();
	}

}
