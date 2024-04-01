package mktprograms;

public class Ifblock {
	public static void main(String[] args) {
		int age = 21;
		if (age >= 21) {
			System.out.println("You can vote");
		} // if 'condition' is True it ill execute //
		if (age > 18) {
			System.out.println("18");
		}
		if (age < 30) {
			System.out.println("30");
		}
		if (age == 21) {
			System.out.println("Equal to 21");
		}
		if (age < 75) {
			System.out.println(" 75");
		}
		
	
		
		System.out.println("*******************");
	
		
		if (age > 21) {
			System.out.println("ELSE IF You can vote"); //false
		} // if 'condition' is True it ill execute //
		else if (age < 18) {
			System.out.println("ELSE IF 18");  //false
		}
		else if (age < 30) {
			System.out.println("ELSE IF 30");
		}
		else if (age == 21) {
			System.out.println("ELSE IF Equal to 21");
		}
		else if (age < 75) {
			System.out.println("ELSE IF  75");
		}
		else
			System.out.println("ELSE IF You can't vote");
	
	}

}
