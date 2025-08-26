package Day_7;
//Compare two Strings 

public class Compare_Strings {
	public void meth1() {
	
	String str1="nikki";
	String str2="nikki12345";
	boolean s=str1.equals(str2);
	System.out.println("String1 and String2 are equal?:"+s);
	System.out.println("using compareTo():"+str1.compareTo(str2));
	}


	public static void main(String[] args) {
		Compare_Strings cs=new Compare_Strings();
		cs.meth1();
		

	}

}
