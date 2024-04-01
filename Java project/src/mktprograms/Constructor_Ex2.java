package mktprograms;

public class Constructor_Ex2 {
	
	public static void div() {
		int x = 315;
		int y = 120;
		int z = x/y;
		System.out.println("div="+z);
	}
	
	void mul() {
		int x = 25;
		int y = 25;
		int z = x*y;
		System.out.println("mul="+z);
		
	}
	Constructor_Ex2(){
		System.out.println("Hello");
	}
	
	public static void main(String[]args) {
		
		div();//static method
		Constructor_Ex2 c1 = new Constructor_Ex2();
		c1.mul();//non-static method
		
	}

}

