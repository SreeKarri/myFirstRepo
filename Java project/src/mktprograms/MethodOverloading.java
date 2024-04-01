package mktprograms;

public class MethodOverloading {
	public static void add() {
		System.out.println("sum");
	}
	static void add(int a ,int b) {
		System.out.println(a+b);
	}
	public static void sub(short a, int b) {
		System.out.println(a-b);
	}
	static void sub(byte a,int b) {
		System.out.println(a-b);
	}
	static void mul(int a, byte b){
		System.out.println(a*b);
	}
	void div(int x ,int y) {
		System.out.println(x/y);}
	
	void modulas(int a, int b) {
		System.out.println(a%b);
	}
	public void sub(double a, short b) {
		System.out.println(a-b);
	}
	MethodOverloading(){
		System.out.println("Sita");
	}
	MethodOverloading(String z){
		System.out.println("Ram");
		
	}
	
	public static void main(String[] args) {
		add();
		add(12,24);
		sub((short) 234,40);
		sub((short) 124,967);
		mul(88,(byte) 66);
		MethodOverloading m1=new MethodOverloading();
		m1.div(127,70);
		m1.modulas(66, 99);
		m1.sub(88.8, (short)200);
		new MethodOverloading();
		new MethodOverloading("Ram");
		
		
		
		
		
		

	}

}
