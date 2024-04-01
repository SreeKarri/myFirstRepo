package mktprograms;

public class GlobalVariableEx { //Static Global Variable
	
	final static int a =30;
	 
	static int b =10;


	
	static void add()
	
	{
	
		System.out.println("add="+(a+b));
		
	}
	static void sub() {
		System.out.println("sub="+ (a-b));
	}
	void add1() {
		System.out.println("add="+(a+b));
	}
	void sub1() {
		System.out.println("sub="+(a-b));
		
	}

	public static void main(String[] args) {
		add();
		sub();
		GlobalVariableEx g=new GlobalVariableEx();
		g.add1();
		g.sub1();
		
		

	}

}
