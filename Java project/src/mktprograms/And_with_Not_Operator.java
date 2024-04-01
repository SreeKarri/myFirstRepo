package mktprograms;

public class And_with_Not_Operator {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		if(!(a>10 && b<60)) {                     //if(!(a<10 || b<60))
		System.out.println("valid numbers");
	}
		else {
			System.out.println("invalid numbers");
		}

}
}
