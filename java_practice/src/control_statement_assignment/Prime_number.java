package control_statement_assignment;

public class Prime_number {

	public static void main(String[] args) 
	{
		int n=3;
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		System.out.println(prime);
	}

}
