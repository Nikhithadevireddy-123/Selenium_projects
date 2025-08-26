package basic_module;

public class hostel {
	String sname="Nikhitha";
	int fees=5000;
	int roomno=300;
	float pricepernight=450.00f;
	boolean privaterooms=true;
	long contactinfo=7786954998l;
	String location="ameerpet hyderabad 500097 ";
	public static void main(String[] args) 
	{
		hostel obj=new hostel();
		System.out.println("sname  = " + obj.sname);
		System.out.println("fees  = " +obj.fees);
		System.out.println("roomno  = " +obj.roomno);
		System.out.println("rivaterooms  = " +obj.privaterooms);
		System.out.println("Contactinfo  = " +obj.contactinfo);
		System.out.println("location  = " +obj.location);

	}

}
