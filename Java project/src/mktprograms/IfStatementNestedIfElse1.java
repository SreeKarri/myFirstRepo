package mktprograms;

public class IfStatementNestedIfElse1 {  //Nestedifelse

	public static void main(String[] args) {
		int age=21;
		float salary = 20000.50f;
		
		if (age > 21) { //true
			System.out.println("Employee1");
			    if(salary>10000) { //true
			    	System.out.println("Employee2");}
		
		else{
			System.out.println("no employees");
		}
			    if(age< 80) { //true
			    	System.out.println("80");
			    }
			    else {
			    	System.out.println("no more");
			    }
		}	    	
			    else {
			    		 System.out.println("In valid Employee");
			    	 }
			    }
		}
		

	


