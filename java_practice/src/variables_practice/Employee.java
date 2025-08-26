package variables_practice;

public class Employee {
	int empid;
	String empname;
	double empsalary;
	String emplocation;
	String empdept;
	static String companyName="wipro";
	void empdetails(int empid1,String empname1,double empsalary1,String emplocation1,String empdept1)
	{
		empid = empid1;
		empname=empname1;
		empsalary =empsalary1;
		emplocation =emplocation1;
		empdept = empdept1;
		
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee name : "+empname);
		System.out.println("Employee salary : "+empsalary);
		System.out.println("Employee location : "+emplocation);
		System.out.println("Employee department : "+empdept);
		System.out.println("Company name : "+companyName);	
	}
	public static void main(String[] args) {
		Employee obj =new Employee();
		obj.empdetails(100,"nikki",4000.0,"hyderabad","developer");
		

	}

}
