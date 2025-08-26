package oops_practice;

public class Thiskeyword {
	void setname(String name)
	{
		System.out.println(name);
	}
	void getname()
	{
		this.setname("nikki");
		System.out.println("welcome to java learning");
	}

	public static void main(String[] args) {
		Thiskeyword t=new Thiskeyword();
		t.getname();
		

	}

}
