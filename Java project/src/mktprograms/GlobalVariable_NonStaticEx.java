package mktprograms;

public class GlobalVariable_NonStaticEx {
	int a=40;
	int b= 20;
	    
	 void add() {
		 a=50;
		System.out.println("add="+(a+b));
	}
	 void sub() {
		 System.out.println("sub="+(a-b));
	 }

	public static void main(String[] args) {
		GlobalVariable_NonStaticEx g=new GlobalVariable_NonStaticEx();
		g.add();
		g.sub();
	}

}
