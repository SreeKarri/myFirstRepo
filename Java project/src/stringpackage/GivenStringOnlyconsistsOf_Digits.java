package stringpackage;

import java.util.Arrays;

public class GivenStringOnlyconsistsOf_Digits {

	public static void main(String[] args) {
		String s = "1234";
		char[] Num = s.toCharArray();
		boolean b = true;

		for (int i = 0; i < s.length(); i++) {

			b = Character.isDigit(Num[i]);
			// System.out.println(b);
			if (b == false) {
				break;
			}

		} // for

		if (b == false) {
			System.out.println("The String consists not only Digits");
		} else {
			System.out.println("The String consists only Digits");
		}

	}
}
