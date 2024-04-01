package mktprograms;

interface Parent1 {
	void signup();        //Multiple Level InHeritance

}

interface Parent2 {
	void Register();
}

interface Parent3 {
	void Register1();
}

public class MultipleLevelInHeritance implements Parent1, Parent2, Parent3 {
	static void signin() {
		System.out.println("Signining into Website");
	}

	void Subscription() {
		System.out.println("Subscribe the channel");
	}

	public static void main(String[] args) {
		MultipleLevelInHeritance mul1 = new MultipleLevelInHeritance();
		mul1.signup();
		mul1.Register();
		mul1.Register1();
		mul1.Subscription();
		signin();
	}

	public void Register1() {
		System.out.println("Registering");

	}

	public void Register() {

		System.out.println("Enter details to Register");
	}

	public void signup() {
		System.out.println("Signup");

	}

}
