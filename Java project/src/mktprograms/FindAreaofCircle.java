package mktprograms;

import java.util.Scanner;

public class FindAreaofCircle {

	// Area of Circle formula: pi*r*r
	
	static final double pi = 3.14;
	static double r;
	static Scanner s1;

	static void areaofcircle(double radius) {

		System.out.println("Area of circle=" + (pi * radius * radius));
	}

	public static void main(String[] args) {
		
		
		
		for (double a = 0; a < 10; a++)
		{
			System.out.println("Enter Radius value for 10 times: ");
			s1 = new Scanner(System.in);

			double r = s1.nextDouble();
			areaofcircle(r);

	
		}
		//s1.close();
		System.out.println("Printed radius values completed");

	}

}
