package mktprograms;

public class Forpractice_static_nonstatic_constructor {
	
	public static void add() {
		int a = 55;
		int b = 99;
		int c =a+b;
		System.out.println(c);
		
	}
	public void mul() {
		int a= 44;
		int b= 22;
		int c= a*b;
		System.out.println(c);
		
	}
	public Forpractice_static_nonstatic_constructor() {
		System.out.println("for my work");
	}
	public static void main(String[]args) {
		add();
		Forpractice_static_nonstatic_constructor F1 = new Forpractice_static_nonstatic_constructor();
		F1.mul();
		
		
	}

}
