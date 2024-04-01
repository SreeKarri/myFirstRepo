package stringpackage;

public class Print_vertical_reverse {
	

static void PrintVertical() {  //Vertical
	String name ="Prannya";

	for(int i=0;i<name.length();i++) {
	
		 char a1=name.charAt(i);
		System.out.println(a1);
	}
}
static void PrintReverse() {  //reverse
	String s1="Venya karri";
	for(int a=s1.length()-1;a>=0;a--) {
	char b=s1.charAt(a);
	System.out.println(b);
}
}
	public static void main(String[] args) {
		PrintVertical();
		System.out.println("=============================");
		PrintReverse();

	}

}
