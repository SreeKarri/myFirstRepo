package mktprograms;

import java.util.Scanner;

public class GlobalVariablewithScanner_Ex2 {
	int a;
	int b;

	void add() {
		System.out.println("sum=" + (a + b));
	}

	void sub() {
		System.out.println("sub=" + (a - b));
	}

	void div() {
		System.out.println("div=" + (a / b));
	}

	void Mul() {
		System.out.println("Mul=" + (a * b));
	}

	void Modulas() {
		System.out.println("Modulas=" + (a % b));
	}

	public static void main(String[] args) {
		GlobalVariablewithScanner_Ex2 g = new GlobalVariablewithScanner_Ex2();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter values: ");
		g.a = s1.nextInt();
		g.b = s1.nextInt();
		g.add();
		g.a = s1.nextInt();
		g.b = s1.nextInt();
		g.sub();
		g.a = s1.nextInt();
		g.b = s1.nextInt();
		g.div();
		g.a = s1.nextInt();
		g.b = s1.nextInt();
		g.Mul();
		g.a = s1.nextInt();
		g.b = s1.nextInt();
		g.Modulas();
		s1.close();

	}
}
