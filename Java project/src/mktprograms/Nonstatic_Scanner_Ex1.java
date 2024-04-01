package mktprograms;

import java.util.Scanner;

public class Nonstatic_Scanner_Ex1 { ////Local Variable

	void sub(int a,int b) { 
		  
		  int subtraction=a-b;
		  System.out.println("sub="+ subtraction);
		  }

		void add(int a,int b) {
		  
		  int addition=a-b;
		  System.out.println("add="+ addition);
		  }
	void div(int a,int b) {
		int division= a/b;
		System.out.println("div="+division);
	}
	void mul(int a, int b) {
		int multiplication=a*b;
		System.out.println("mul="+multiplication);
	}
	void modulas(int a,int b) {
		int modulas=a%b;
		System.out.println("modulas="+modulas);
	}
		public static void main(String[]args) {
			 Nonstatic_Scanner_Ex1 n1=new  Nonstatic_Scanner_Ex1();
			
			Scanner s1=new Scanner(System.in);
			int i1=s1.nextInt();
			int i2=s1.nextInt();
			n1.sub(i1,i2);
			int i3=s1.nextInt();
			int i4=s1.nextInt();
			n1.add(i1,i2);
			int i5=s1.nextInt();
			int i6=s1.nextInt();
			n1.div(i5,i6);
			int i7=s1.nextInt();
			int i8=s1.nextInt();
			n1.mul(i7,i8);
			int i9=s1.nextInt();
			int i10=s1.nextInt();
			n1.modulas(i9,i10);
			}
}


