package exceptionHandiling;

public class March23_Assignment {

	public static void main(String[] args) {
		String s=null;
		try {
			s.length();
			
		}
		
		
		catch(java.lang.NullPointerException e) {
			
			System.out.println("Exception value "+ e );
		}
		
		
}
}
	


