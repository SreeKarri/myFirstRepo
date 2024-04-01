package stringpackage;

public class String_FirstClass_myname {

	public static void main(String[] args) {
		String name="null";
		name.length();
		try{name.charAt(5);
		}
catch(java.lang.StringIndexOutOfBoundsException e) {
			
			System.out.println("Exception value "+ e );
		}
		
		//System.out.println(name);
		//System.out.println(name.length());
		/*System.out.println(name.charAt(3));//index value-0,1,2,3,4,.....
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.indexOf('i'));
System.out.println("Sree karri".equals("sreekarri"));*/
      
	}

}
