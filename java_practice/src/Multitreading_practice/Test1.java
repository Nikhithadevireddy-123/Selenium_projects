package Multitreading_practice;

public class Test1 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("welcome");
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public class Test extends Thread{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
			System.out.println("hello");
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Test t1=new Test();//creating thread
		Test1 t2=new Test1();//syso(Thread.currentThread().getName());
		
		t1.start();
		t2.join();
		
		t2.start();
		t1.join();
		
		

	}

}
