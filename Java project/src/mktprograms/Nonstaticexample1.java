package mktprograms;

public class Nonstaticexample1 {

	void add() { //add = methodname//

		int a = 25;
		int b = 25;
		int sum = a+b;
		System.out.println("Add="+sum);
}
	void sub() {
	   
	  int a = 50;
	  int b = 25;
	  int c = a-b;
	
	System.out.println("Sub="+c);
	}
	
	void div() {
		int a =100;
		int b = 50;
		int c = a/b;
		System.out.println("Div ="+c);
	}
	void multi() {
		int a = 62;
		int b = 33;
		int c = a*b;
		System.out.println("Multi ="+c);
	}
	void modulas() {
		int a = 2;
		int b = 2;
		int c = a%b;
		System.out.println("Modulas ="+c);
	}
	public static void add2() {
		 int a = 75;
		 int b = 65;
		 int sum = a+b;
		 System.out.println("Add2 ="+sum);
	}
	static void sub2() {
		int a = 125;
		int b = 25;
		int c = a-b;
		System.out.println("Sub2 ="+c);
	}
	public static void div2() {
		int a = 125;
		int b = 50;
		int c= a/b;
		System.out.println("Div2 ="+c);
	}
	public static void multi2() {
		int a = 30;
		int b = 40;
		int c = a*b;
		System.out.println("Mul2 ="+c);
				
	}
	static void modulas2() {
		int a = 500;
		int b= 500;
		int c = a%b;
		System.out.println("Modulas2="+c);
	}
	

	public static void main(String[]args){
		add2();
		sub2();
		div2();
		multi2();
		modulas2();

Nonstaticexample1 N1 = new Nonstaticexample1 ();
		N1.add();
		N1.sub();
		N1.div();
		N1.multi();
		N1.modulas();
   }
}
