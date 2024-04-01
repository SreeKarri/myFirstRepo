package mktprograms;

public class Add_method
{
	static {
		System.out.println("I am SIB");
	}
    public static void add() {
    
    	System.out.println("Addition");	
    }
    static void sub() {
    	System.out.println("subtraction");
    }
    static void mul() {
    	System.out.println("Multiplication");
    }
    
    static void div() {
    System.out.println("division");
    }
    {
    	System.out.println("i am IIB");}
    {System.out.println("i am IIB1");}
    {System.out.println("i am IIB2");}
    Add_method(){
    	System.out.println("I am constructor");
    }
    	
    	
    
   public static void main(String[]args)
   {
	   System.out.println("Counting");
       add();
       sub();
       mul();
       div();
       Add_method a1=new Add_method();
   }
}
