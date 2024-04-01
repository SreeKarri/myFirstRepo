package mktprograms;

class GrandfatherClass{
	GrandfatherClass(int a,int b) {

		System.out.println("3");
	}
}
	class Parentclass extends GrandfatherClass{
		Parentclass(int a,int b) {
			super(10,10);
			System.out.println("2");
		}
	}
	class Childclass extends Parentclass {
		Childclass() {
			super(10,20);
			System.out.println("1");
		}
	}
	public class SuperCallingStatement_Constructor {
		
		SuperCallingStatement_Constructor(){
			System.out.println("4");
		}
		public static void main(String[] args) {
			//SuperCallingStatement_Constructor s1=new SuperCallingStatement_Constructor();
			Childclass c1=new Childclass();
		}
}
