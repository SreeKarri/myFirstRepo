package mktprograms;
class parent_constructor {
	parent_constructor(){
		System.out.println("parent constructor");
	}
}

public class ThisCallingStatement_Constructor {
	
	ThisCallingStatement_Constructor(){
		//this();
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		ThisCallingStatement_Constructor t1=new ThisCallingStatement_Constructor();
	}

}
