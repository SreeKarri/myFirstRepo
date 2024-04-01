package mktprograms;

public class This_Keyword_nonStatic {
	String name;
	int age;
	float salary;
	void Employeedetails(String name,int age,float salary) {
		System.out.println("I am " + name +" My age is " + age + " My Salary is " + salary);
	 //this.name=name; // brown color name is local variable
	 //this.age=age;
	 //this.salary=salary;
	}
	public static void main(String[] args) {
		This_Keyword_nonStatic t1=new This_Keyword_nonStatic();//created object
		t1.Employeedetails("Karri",39,10000);//Reference variable
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);

	}

}
