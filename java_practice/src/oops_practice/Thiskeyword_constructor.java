package oops_practice;
//refer current class constructor using this keyword

public class Thiskeyword_constructor {
	Thiskeyword_constructor(String name)
	{
		System.out.println(name);
	}
	Thiskeyword_constructor()
	{
		this("im nikhitha from hyd");
		System.out.println("i am learning java");
	}
	
	

	public static void main(String[] args) {
		Thiskeyword_constructor t=new Thiskeyword_constructor();

	}

}
