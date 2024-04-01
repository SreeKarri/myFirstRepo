package stringpackage;

import java.util.Arrays;

public class ChecIfStringOnlyConsitsOfDIGIT {

	public static void main(String[] args) {
		 int count_of_Alphabet=0;
         String s = "1234";
		
		boolean b = true;

		for (int i = 0; i < s.length(); i++) {
			 b = Character.isDigit(i);
			if(b==true) {
				count_of_Alphabet++;
			}
		}
	long L=s.length();
	char[] a1=
		   b=Arrays.equals(null, L, count_of_Alphabet, null, L, L);
		
		

	}

}

