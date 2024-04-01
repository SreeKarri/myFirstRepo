package exceptionHandiling;

public class ExceptionHandiling_Ex1 {

	public static void main(String[] args) {
	   try {
          int c=1/0;      //If exception not occurs _Try will execute 
          System.out.println("try");
	   }
	   catch( java.lang.ArithmeticException a1){ //If exception occurs _Catch will execute
		 System.out.println("catch");  
	   }
	}

}
