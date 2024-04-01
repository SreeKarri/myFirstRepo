package mktprograms;

public class ConstructorExample1 {
	ConstructorExample1(){
		System.out.println("Hi World");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		//ConstructorExample1 c1 = new ConstructorExample1();//first syntax
		 new ConstructorExample1();//second syntax
		
	}

}
