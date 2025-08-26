package Day_7;
//Check if character is a Digit

public class Test_char {
	public void meth()
	{
		char ch='a';
		boolean b=Character.isDigit(ch);
		System.out.println(ch+ " is digit? " + b);
		
	}

	public static void main(String[] args) {
		Test_char h=new Test_char();
		h.meth();
		

	}

}
