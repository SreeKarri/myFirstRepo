package stringpackage;

public class Find_SpecialCharaters_in_String {

	public static void main(String[] args) {
		
		int count_of_Alphabet = 0;
		int count_of_Space = 0;
		int count_of_Numeric = 0;
		int splCharCount = 0;

		String s = "Manish123 $#*& Kumar";

		char[] a1 = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			boolean b = Character.isAlphabetic(a1[i]);
			boolean b1 = Character.isSpaceChar(a1[i]);
			boolean b2 = Character.isDigit(a1[i]);

			if (b == true) {
				count_of_Alphabet++;

			}
			if (b1 == true) {

				count_of_Space++;
			}
			if (b2 == true) {

				count_of_Numeric++;
			}

		}
	// add all three counts// subtract from total lenght of the string, which gives special chars

		splCharCount = (s.length() - (count_of_Alphabet + count_of_Space + count_of_Numeric));
		System.out.println("The number of special characters in a String is " + splCharCount);

	}

}
