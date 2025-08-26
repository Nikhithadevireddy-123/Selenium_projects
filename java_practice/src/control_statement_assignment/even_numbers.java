package control_statement_assignment;

//WAP to print even nbrs from 2 to 50
public class even_numbers {
	public void numbers(int num) {
		for(int i=2;i<=50;i++)
		{
		  if(i%2==0)
		  {
			  System.out.println(i);
		  }
		}	
	}
//----------------------------------------------------------------------------------
	
	//WAP to print square of numbers
	public void square_numbers() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*i);
		}
		
	}
//--------------------------------------------------------------------------------------
	
	//WAP to print multiplication table of 17
	
	public void multiplication(int x)
	{         
		for(int i=0;i<=10;i++)
		{
			int y=x*i;
			System.out.println(x +" * " + i +" = " + y );
		}
	}

//-----------------------------------------------------------------------------------------------------
	
	//WAP TO REVERSE A NUMBERS FROM 20 TO 1
	
	public void reversenumbers()
	{
		int temp=0;
		for(int i=20;i>=1;i--)
		{
			System.out.println(i);
		}	
	}
	
//-------------------------------------------------------------------------------------------------
	
	//WAP to print factorial of a number
	
	public void factorial_numbers(int num)
	{
	
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
		}
		System.out.println("factorial number is " +factorial);
		
	}
	
//--------------------------------------------------------------------------------------------------------
	
	 //WAP to print if a number is prime or not
	public void prime_numbers(int num)
	{
		
	}
	
	public static void main(String[] args) {
		even_numbers obj=new even_numbers();
		//obj.numbers(8);
		//obj.square_numbers();
		//obj.sum_numbers();
		//obj.multiplication(17);
		//obj.reversenumbers();
		//obj.factorial_numbers(5);
	}

}
