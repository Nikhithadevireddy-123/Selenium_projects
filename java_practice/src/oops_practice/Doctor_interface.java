package oops_practice;


interface Doctor
{
	void operation();
	void OPD();
}
interface Nurse
{
	void dailycheck();
	void documentation();
}
interface Accountant
{
	void payment();
	void query();
}
class hospital implements Doctor,Nurse,Accountant
{
	public void payment()
	{
		System.out.println("payment done");
	}
	public void query()
	{
		System.out.println("no queries");
	}
	public void documentation()
	{
		System.out.println("documentation ready");
	}
	public void dailycheck()
	{
		System.out.println("daily check is neccessary");
	}
	public void operation()
	{
		System.out.println("operation is going on");
	}
	public void OPD()
	{
		System.out.println("OPD is here");
	}
		
}
public class Doctor_interface{
	public static void main(String[] args) {
		hospital h=new hospital();
		h.dailycheck();
		h.documentation();
		h.OPD();
		h.operation();
		h.payment();
		h.query();
		

	}

}
