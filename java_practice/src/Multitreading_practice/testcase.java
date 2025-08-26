package Multitreading_practice;

class Demo1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("hello");
		}
	}
	System.out.println(Thread.currentThread().getName());
}
	

public class testcase extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("welcome");
		}
	}
	System.out.println(Thread.currentThread().getName());
		
	public static void main(String[] args) {
		Demo1 t1=new Demo1();
		testcase t2=new testcase();
		t1.start();
		t2.start();
	}
	}


