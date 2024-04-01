package mktprograms;

import java.util.Scanner;

public class SwitchClassExample1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter button number");
		int button=s1.nextInt();
		
	switch(button) {
	
	case(1):System.out.println("Mechine turn on");
	break;
	case(2):System.out.println("Mechine will start working");
	break;
	case(3):System.out.println("Mechine stop workin");
	break;
	case(4):System.out.println("Mechine turn off");
	break;
	default:System.out.println("Wrong selection");
	}
}
}
