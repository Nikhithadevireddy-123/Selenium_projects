package Control_statements_practice;

public class employee_constructor {
	employee_constructor()
	{
		System.out.println("default constructor");
	}
	employee_constructor(int id,String name)
	{
		System.out.println("parameterized constructor");
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
	}
	employee_constructor(String name,int id)
	{
		System.out.println("parameterized constructor");
		System.out.println("name is:"+name);
		System.out.println("id is:"+id);
	}
	employee_constructor(String name,int id,float sal)
	{
		System.out.println("parameterized constructor");
		System.out.println("name is:"+name);
		System.out.println("id is:"+id);
		System.out.println("sal is:"+sal);
		
	}
	public static void main(String[] args) {
		employee_constructor emp=new employee_constructor("nikki",101,100.0f);
		

	}

}
