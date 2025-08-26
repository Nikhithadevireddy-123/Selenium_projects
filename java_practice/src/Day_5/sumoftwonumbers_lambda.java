package Day_5;
interface Even 
{
	boolean iseven(int num);
}

public class sumoftwonumbers_lambda {

	public static void main(String[] args) {
		Even check=(num)->num%2==0;
		System.out.println(check.iseven(2));
	}

}
