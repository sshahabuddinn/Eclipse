package practice1;

public class Developer implements Banking, Investment{

	public static void main(String[] args) {
		
		 Developer dev=new Developer();
		 dev.creditbank();
		 dev.debitbank();
		 dev.login();
		 dev.teardown();
		 
		 Banking bak=new Developer();  //runtime polymorphism
		 
		 bak.creditbank();
		 bak.login();
		 bak.debitbank();
		 
		 Investment inv=new Developer();
		 inv.investment();
	}

	@Override
	public void login() {
		
		System.out.println("login success");
		
	}

	@Override
	public void debitbank() {
		System.out.println("debit success");
		
	}

	@Override
	public void creditbank() {
		System.out.println("credit success");
		
	}
	
	public void teardown()
	{
		System.out.println("close success");
	}

	@Override
	public void investment() {
		System.out.println("some investment done");
		
	}

}
