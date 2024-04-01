package mktprograms;

import java.util.Scanner;

public class FindCircumferenceOfCircle {

	// Circumference of Circle formula: 2 pi * r
	static final double pi = 3.14;
	int r;

	static void circumferenceofcircle(int radius) {
		
		System.out.println("Circumference of circle=" + (2*pi*radius));
	}

	public static void main(String[] args) {

		System.out.println("Enter circumference value: ");
		Scanner s1 = new Scanner(System.in);

		int r = s1.nextInt();
		circumferenceofcircle(r);

		s1.close();

	}

}
