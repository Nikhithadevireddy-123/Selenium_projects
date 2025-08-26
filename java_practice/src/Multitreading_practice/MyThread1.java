package Multitreading_practice;

class Table
{
	//Synchronized method
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch()
				
				
				
			}
		}
	}
class MyThread1 extends Thread{
	Table t;
	
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
}

	class MyThread2 extends Thread{
		Table t;
		
		MyThread2(Table t)
		{
			this.t=t;
		}
	}
}
public class MyThread1 {
	public static void main(String[] args) {
		Table obj=new Table();
		MyThread1 
		
		

	}

}
