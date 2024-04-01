package stringpackage;

import java.util.Arrays;

public class GivenStringOnlyconsistsOf_Alphabets {

	public static void main(String[] args) {

		String s = "Sree";

		char[] Alpha = s.toCharArray();
		boolean b = true;

		for (int i = 0; i < s.length(); i++) {

			b = Character.isAlphabetic(Alpha[i]);
			// System.out.println(b);
			if (b == false) {
				break;
			}

		}

		if (b == false) {
			System.out.println("The String consists not only Alphabets");
		} else {
			System.out.println("The String consists only Alphabets");
		}

	}
}
