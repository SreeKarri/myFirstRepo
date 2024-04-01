package mktprograms;

public class SibIibConMainmethod{
	static {
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
	{System.out.println("I am 2nd IIb");}
	SibIibConMainmethod(){
		System.out.println("I am a constructor");
		}
	public static void main(String[] args) {
		
		System.out.println("I am a Main Method");
		
		SibIibConMainmethod S1=new SibIibConMainmethod();
		    //new SibIibConMainmethod();
		
		//SibIibConMainmethod S2=new SibIibConMainmethod();
		//SibIibConMainmethod S3=new SibIibConMainmethod();

	}

}
