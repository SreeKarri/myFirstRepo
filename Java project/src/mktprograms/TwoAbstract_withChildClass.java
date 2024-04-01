package mktprograms;
abstract class zoom{
	abstract void Login();
	abstract void Logout();
}

public class TwoAbstract_withChildClass extends zoom{ // child class

	


	@Override
	void Login() {
		System.out.println("Login");
		
	}

	@Override
	void Logout() {
		System.out.println("Logout");
		
	}
	public static void main(String[] args) {
		TwoAbstract_withChildClass t1=new TwoAbstract_withChildClass();
		t1.Login();
		t1.Logout();

	}

}
