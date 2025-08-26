package variables_practice;

public class String_buffer {
	

	public static void main(String[] args) {
		String s="Hello";
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println("substring():" +sb.substring(1,4));
		System.out.println();
		

	}

}
