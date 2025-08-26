package Enum_practice;

interface Doctor
{
	void payments();
	void operation() ;	
}

enum Nurse implements Doctor{
	Hospital{
	public void payments()
	{
		System.out.println("payment done");
	}
	public void operation()
	{
		System.out.println("operation successfully done");
	}
	
		
    };
}
public class Enum_interface {
	public static void main(String[] args) {
		Nurse a=Nurse.Hospital;
		a.payments();
		a.operation();
	}
}
