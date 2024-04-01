package mktprograms;

abstract class Grandparent {
	abstract void facebook(); // ab1

	abstract void login();// ab2

	void Subscription() { // concrete class
		System.out.println("Subscription");
	}
}

abstract class parent extends Grandparent {
	abstract void Registration(); // ab3

	abstract void logout(); // ab4

	static void unsubscribe() {
		System.out.println("Unsubscribe");// concrete class
	}
}

public class AbstractClass_Method_concretemethos_Ex extends parent {

	static void signature() {
		System.out.println("signature");
	}

	void details() {
		System.out.println("details");
	}

	void facebook() {
		System.out.println("facebook");
	}

	void login() {
		System.out.println("login");
	}

	void logout() {
		System.out.println("logout");
	}

	
	void Registration() {
		System.out.println("Registration");
	}

	public static void main(String[] args) {
		AbstractClass_Method_concretemethos_Ex ab1 = new AbstractClass_Method_concretemethos_Ex();
		ab1.Registration();
		ab1.logout();
		unsubscribe();
		ab1.facebook();
		ab1.login();
		ab1.Subscription();
		ab1.details();
		signature();
	}

}
