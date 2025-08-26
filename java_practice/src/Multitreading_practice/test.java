package Multitreading_practice;

//We can create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface
class Test11 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Welcome");
		}
		System.out.println("Print id for thread="+Thread.currentThread().getId());
		System.out.println("current name="+Thread.currentThread().getName());
		Thread.currentThread().setName("Print_welcome_message");
		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test1 is="+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		System.out.println("New Priority for test1 is="+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		
	}
}

public class test extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Hello ");
		
		}
	    System.out.println("Print id for thread="+Thread.currentThread().getId());
		System.out.println("current name="+Thread.currentThread().getName());
		Thread.currentThread().setName("Print_Hello_message");
		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test is="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("New Priority for test is="+Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) throws InterruptedException {
		test t1=new test();// creating thread
		Test1 t2=new Test1();//System.out.println(Thread.currentThread().getName());
		
		t1.start();
		
		t2.join();
		
		t2.start();
		t1.join();
    System.out.println(t1.isAlive());

	}

}

