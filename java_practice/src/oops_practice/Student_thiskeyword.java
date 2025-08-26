package oops_practice;

public class Student_thiskeyword {
	int rollno,age;
	String name,collegename,address;
	float per;
	void details(int rollno,String name,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("per:"+per);
	}
	
   void details(int rollno,String name)
   {
	   this.rollno=rollno;
	   this.name=name;
	   System.out.println("rollno:"+rollno);
	   System.out.println("name:"+name);
   }
	public static void main(String[] args) {
		Student_thiskeyword s=new Student_thiskeyword();
		s.details(101, "nikki", 20.0f);
		s.details(106, "chinni");
		

	}

}
