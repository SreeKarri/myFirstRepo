package stringpackage;


public class March22ndAssignment_divisibleby3and5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
		if(i %5==0) {
			System.out.println("cat -"+i);
			
		}
		if(i%3==0) {
			System.out.println("Frog  -"+i);
		}
		if(i%5==0 && i%3==0) {
			System.out.println("Cat & Frog -"+i);
			
			
		}
	}
		
		

}
}
