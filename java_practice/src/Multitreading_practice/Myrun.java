package Multitreading_practice;


class myrun1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
		}
		System.out.println("current name="+Thread.currentThread().getName());
	}
}
public class Myrun {

	public static void main(String[] args) {
		myrun1 t=new myrun1();//runnable interface child objects(Runnable state) 
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		
		//Constructor for thread
		//Thread()
		//Thread(Runnable state)
		//Thread(Thread name)
		//Thread(Runnable state,Thread Name)
		

	}

}
