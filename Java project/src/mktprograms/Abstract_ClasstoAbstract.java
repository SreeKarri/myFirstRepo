
package mktprograms;
interface web{
	 void  Registration ();	
}
interface Mobile extends web{
	void subscription();
}



abstract class safari implements  Mobile {
	abstract void login(); 
		
	
}
public class Abstract_ClasstoAbstract extends safari{
	
	static void logout() {
		System.out.println("logout");
	}
	public static void main(String[] args) {
		logout();
		Abstract_ClasstoAbstract a=new Abstract_ClasstoAbstract();
		a.login();
		a.Registration();
		a.subscription();
	}

	@Override
	void login() {
		System.out.println("login");
		
	}
	@Override
	public void Registration() {
		System.out.println("web");
		
	}
	@Override
	public void subscription() {
		System.out.println("subscription");
		
	}
}