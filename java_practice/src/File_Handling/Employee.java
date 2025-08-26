package File_Handling;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	public char[] toString;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}

}
