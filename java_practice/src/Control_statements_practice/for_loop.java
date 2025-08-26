package Control_statements_practice;

public class for_loop {

	public static void main(String[] args) {
		//for(int i=1;i<=10;i++)
	//	{
		//	System.out.println(i);
		
	//-------------------------------------------------------------------------------------	
		/*for(int i=0;i<5;i++)
		
			for(int j=0;j<5;j++)
			{
				System.out.print("*  ");
			}
			System.out.println( );
		}*/
		
		//---------------------------------------------------------------------
		
		/*for(int i=0;i<5;i++)//i=0,1,2,3,4,5=false     o/p-//*
		 /*
		{
			//if i is 1,then first j is 0 ,0<=1 and1<=1 so * *
			for(int j=0;j<=i;j++)//j=0,1,2,3,4,5   
			{
				System.out.print("*  ");
			}
			System.out.println( );
		}*/
		
	//-------------------------------------------------------------------------	
		/*
		int x=5;         //multiplication of table
		for(int i=0;i<=10;i++)
		{
			int y=x*i;
			System.out.println(x +" * " + i +" = " + y );	
		}*/
		
		//---------------------------------------------------------------
		
		/*for(int i=5;i>0;i--)            //op-* * * * *
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
		}	*/    
		
	//--------------------------------------------------------------
		
		/*for(int i=1;i<=10;i++)            //numbers from 1 to 100
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println( );
		}*/
	//----------------------------------------------------------------------
		
		/*for(int i=1;i<=5;i++)            //right angled triangle but in numbers
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ "  ");
			}
			System.out.println( );	
		}*/
	//---------------------------------------------------------------------	
		//       1
		//      1 1
		//     1 2 1
		//    1 2 2 1
		
		for(int i=1;i<=5;i++)           
		{
			int num=1;
			for(int j=1;j<5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.println(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println( );	
		}
		
		
	}
}


