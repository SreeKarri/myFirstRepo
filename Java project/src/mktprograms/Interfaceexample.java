package mktprograms;

interface facebook {
	void Registration();

	void login();
}

abstract class Facebookhomepage implements facebook {
	abstract void Website();

	abstract void Homepage();

	void logout() { //concrete method
		System.out.println("Logout Page");
	}
}

public class Interfaceexample extends Facebookhomepage {
	void Subscribe() {
		System.out.println("Subscribe the Website");
	}

	public static void main(String[] args) {
		Interfaceexample in1 = new Interfaceexample();
		in1.Registration();
		in1.login();
		in1.Website();
		in1.Homepage();
		in1.logout();
		in1.Subscribe();

	}

	public void Registration() {
		System.out.println("Registration");
	}

	public void login() {
		System.out.println("Login");
	}

	void Website() {
		System.out.println("Website");
	}

	void Homepage() {
		System.out.println("Homepage");
	}

}
