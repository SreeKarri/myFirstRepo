package stringpackage;

import java.util.Arrays;

public class InagivenString_FindHowMany_Numerics_present {

	public static void main(String[] args) {
		
		String s = "Venya1234";

		char[] value = s.toCharArray();
		System.out.println(Arrays.toString(value));
		for (int i = 0; i < s.length(); i++) {
			boolean b = Character.isDigit(value[i]);
			System.out.println(b);
			if (b == true) {
				System.out.println("Numeric is present at Index= " +i );
			}
		}
		
	}

}
