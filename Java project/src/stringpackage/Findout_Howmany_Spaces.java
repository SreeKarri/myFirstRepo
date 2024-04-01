package stringpackage;



public class Findout_Howmany_Spaces {
	public static void main(String[] args) {
		int count_of_Space=0;
	
	String s=" She is a good Student ";
	   char[]a1 =s.toCharArray();
	for(int i=0;i<s.length();i++) {
	boolean	 b= Character.isSpaceChar(a1[i]);
	if(b==true) {
		count_of_Space++;
	}
	}
		
		System.out.println("The number of spaces in a String is "+count_of_Space);	
	}			

}
