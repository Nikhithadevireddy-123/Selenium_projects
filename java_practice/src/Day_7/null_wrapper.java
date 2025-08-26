package Day_7;
//Convert null to wrapper classes 

public class null_wrapper {

	public static void main(String[] args) {
		Integer num=null;
		try {
			int value=num;
			System.out.println("value:"+value);
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot unbox null to primitive datatypes:" +e);
		}
		

	}

}
