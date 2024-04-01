package stringpackage;

import java.util.Scanner;

public class Findout_a_Stringis_Palindrome {

	public static void main(String[] args) {
		
         Scanner s=new Scanner(System.in);
         System.out.println("Enter input name");
            String input =s.next();
            String output="";

		for (int i = input.length() - 1; i >= 0; i--) {

			char rev = input.charAt(i);
			output = output + rev;
			//System.out.println(rev);
			
		}
		
		//System.out.println(input);
		System.out.println(output);

	if (input.equals(output)) {

			System.out.println("palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	  s.close();
	}

}
