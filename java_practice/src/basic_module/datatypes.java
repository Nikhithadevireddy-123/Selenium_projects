package basic_module;

public class datatypes {
	String name="Nikhitha";
	int rollno=100;
	float per=88.9f;
	short age=22;
	String course="java selenium";
	String collegename="vgnt";
	String address="almasguda hyderabad 500097 ";
	char div='D';
	
	public static void main(String[] args)
	{
		datatypes obj=new datatypes();
		System.out.println("name  = " + obj.name);
		System.out.println("rollno  = " +obj.rollno);
		System.out.println("percentage  = " +obj.per);
		System.out.println("Age  = " +obj.age);
		System.out.println("Course  = " +obj.course);
		System.out.println("Collegename  = " +obj.collegename);
		System.out.println("Address  = " +obj.address);
		System.out.println("Division  = " +obj.div);
	}

}
