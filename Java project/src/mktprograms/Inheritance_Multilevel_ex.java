package mktprograms;
class Registration{ // Grand parent class
	static void modulas() {
		System.out.println("Modulas");
	}
}
class LoginAccount extends Registration{//parent class
	static void addition() {
		System.out.println("Addition");
	}
	void subtraction() {
		System.out.println("Subtraction");
	}
}

public class Inheritance_Multilevel_ex extends LoginAccount {//child class
	static void multiplication() {
		System.out.println("Multiplication");
	}
	void division() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		multiplication();
		Inheritance_Multilevel_ex i1=new Inheritance_Multilevel_ex();
		i1.division();
		addition();
		i1.subtraction();
		i1.modulas();
		
		
	}

}
