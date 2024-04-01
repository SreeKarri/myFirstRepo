package mktprograms;

public class MultipleConstructorsEx3 {//this calling statement

	MultipleConstructorsEx3(int a, int b, int c) {
		this('a');
		System.out.println("Sunday " + a + " "+ b+ " "+ c);
	}

	MultipleConstructorsEx3(char x) {
		this("Ram");
		
		System.out.println("Monday "+ x);
		
	}

	MultipleConstructorsEx3(String y)

	{
		this(true);
		System.out.println("Tuesday "+ y);
	}

	MultipleConstructorsEx3(boolean z) {
		this(4,true,"Ram");
		System.out.println("Wednesday "+ z);

	}

	MultipleConstructorsEx3(int a, boolean b, String c) {
		System.out.println("Thursday "+a+" " +b+" " +c);

	}

	public static void main(String[] args) {
		new MultipleConstructorsEx3(21, 28, 5);
		//new MultipleConstructorsEx3('M');
		//new MultipleConstructorsEx3("Ram");
		//new MultipleConstructorsEx3(true);
		//new MultipleConstructorsEx3(7, false, "Sita");
		
	}

}
