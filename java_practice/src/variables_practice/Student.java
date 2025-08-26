package variables_practice;

public class Student {
	int rollno,age;
	float per;
	String name;
	static String collegename="JVM";
	void details(int rollno1,int age1,String name1,float per1)
	{
		rollno=rollno1;
		age=age1;
		per=per1;
		name=name1;
		
		System.out.println("Rollno="+rollno);
		System.out.println("Age="+age);
		System.out.println("percentage="+per);
		System.out.println("Name="+name);
		System.out.println("Collegename="+collegename);
	}

	public static void main(String[] args) {
		
		

	}

}
