package stringpackage;

import java.util.Arrays;

public class String_calculate_noof_Numeric_Values {

	public static void main(String[] args) {
		int count_of_numeric = 0;
		String s = "Abcd1234";
		char[] Num = s.toCharArray();
		//System.out.println(Arrays.toString(Num));

		for (int i = 0; i < s.length(); i++) {
			boolean b = Character.isDigit(Num[i]);
			//System.out.println(b);

			if (b == true) {
				count_of_numeric++;
			}
		}

		System.out.println("The number of numeric inthe given String is " + count_of_numeric);
	}
}
