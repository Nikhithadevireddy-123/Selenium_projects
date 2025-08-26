package Day_6;

public class String_handling {
	public void conversion() {
		int a=10;
		String b=String.valueOf(a);
		System.out.println("String value:"+b);
		
		try {
			int c=Integer.parseInt(b);
			System.out.println("int value:"+c);
			
			String invalidString="abc";
			int invalidConversion=Integer.parseInt(invalidString);
			System.out.println("invalid String:"+invalidConversion);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException:"+e.getMessage());
			System.out.println("String could not be parseint as an integer");
			
		}
	}

	public static void main(String[] args) {
		String_handling s=new String_handling();
		s.conversion();
		

	}

}
