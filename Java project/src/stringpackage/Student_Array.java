package stringpackage;

public class Student_Array {

	public static void main(String[] args) {
	int Rollno[]= {1,2,3,4,5};
	String Student_Name[]= {"Kushal","Kushal P","Vishal Prasad","Monica Rawat","Kushagra Verma"};
	char Gender[]= {'M','M','M','F','M'};
	long Mobile_Number[]= {968574,857412,857421,968521,967452};
	//System.out.println("Rollno");
	//System.out.println("Student_Name");
	//System.out.println("Gender");
	//System.out.println("Mobile_Number");
	
	
	//System.out.print("Rollno"+   "" +"  Student_Name"+ "" +"  Gender"+ "" +"  Mobile_Number");
	
	System.out.println("Rollno"+   "" +"  Student_Name"+ "" +"  Gender"+ "" +"   Mobile_Number");
	System.out.println("                                       ");
	for(int i=0;i<5;i++) {
		
		
		System.out.println(Rollno[i]+    "       "  +Student_Name[i]+ "           "+Gender[i] +"   "+"         "+Mobile_Number[i]);
		//System.out.print("Roll no"+Rollno[i]+ " " +"Student_Name "+Student_Name[i]+ " " +" Gender "+Gender[i]+ " " +" Mobile_Number "+Mobile_Number[i]);
	
		
	}
	
	
	

}
}
