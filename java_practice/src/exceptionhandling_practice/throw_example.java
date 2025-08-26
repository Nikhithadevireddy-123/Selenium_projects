package exceptionhandling_practice;

public class throw_example {

	public static void main(String[] args) {
		String name=null;
		if(name==null)
		{
			throw new NullPointerException("name is not null");
		}
		System.out.println(name.length());
	}

}
