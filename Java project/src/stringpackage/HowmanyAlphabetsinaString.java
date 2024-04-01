package stringpackage;

import java.util.Arrays;

public class HowmanyAlphabetsinaString {

	public static void main(String[] args) {
		int count_of_Alphabet = 0;
		String s = "Ellicott1234";
		char[] state = s.toCharArray();
		System.out.println(Arrays.toString(state));
		
		for (int i = 0; i < s.length(); i++) {
			boolean b = Character.isAlphabetic(state[i]);
			if (b == true) {
				count_of_Alphabet++;
			}
			 

		}
		int L=s.length();
		 int Al=count_of_Alphabet;
		System.out.println(L-(Al));
		boolean b1=Arrays.equals(L, Al);
		System.out.println(b1);

		//System.out.println("The number of alphabets in a String is " + count_of_Alphabet);
	}

}
