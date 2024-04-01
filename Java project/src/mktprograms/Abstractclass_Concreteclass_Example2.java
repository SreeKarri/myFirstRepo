package mktprograms;

abstract class google_class {
	
	abstract void add();

	abstract void division();

	static void Multiplication() {
		int a = 30;
		int b = 10;
		System.out.println(a * b);

	}

	void subtraction() {
		System.out.println(Math.subtractExact(40, 20));
	}

}

public class Abstractclass_Concreteclass_Example2 extends google_class {
	void Modulus() {
		System.out.println(30 % 10);
	}

	@Override
	void add() {
		int a = 10;
		int b = 10;
		System.out.println(a + b);

	}

	@Override
	void division() {
		int a = 20;
		int b = 20;

		System.out.println(a / b);

	}
	

	public static void main(String[] args) {
		Abstractclass_Concreteclass_Example2 ab1 = new Abstractclass_Concreteclass_Example2();
		ab1.add();
		ab1.division();
		Multiplication();
		ab1.subtraction();
		ab1.Modulus();
	}
}
