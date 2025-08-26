package oops_practice;

public class Thiskeyword_object {
	void display(Thiskeyword_object t)
	{
		System.out.println("current class object");
	}
	void show()
	{
		display(this);
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Thiskeyword_object t=new Thiskeyword_object();
		t.show();
		Thiskeyword_object t1;
		t1=new Thiskeyword_object();
		

	}

}
